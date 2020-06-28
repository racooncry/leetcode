package algorithm.test;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/18 14:33
 * @Version: 1.0
 */
public class IdWorker {
    //工作节点ID(0~31)
    private long workerId;
    //数据中心ID(0~31)
    private long datacenterId;

    //毫秒内序列(0~4095)
    private long sequence;

    public IdWorker(long workerId, long datacenterId, long sequence){
        // sanity check for workerId
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0",maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0",maxDatacenterId));
        }
        System.out.printf("worker starting. timestamp left shift %d, datacenter id bits %d, worker id bits %d, sequence bits %d, workerid %d",
                timestampLeftShift, datacenterIdBits, workerIdBits, sequenceBits, workerId);

        this.workerId = workerId;
        this.datacenterId = datacenterId;
        this.sequence = sequence;
    }

    //初始时间截 2019/1/1 0:0:0
    private long twepoch = 1546272000000L;
    //机器id所占的位数
    private long workerIdBits = 5L;



    //数据标识id所占的位数
    private long datacenterIdBits = 5L;

    //支持的最大机器id，结果是31 (这个移位算法可以很快的计算出几位二进制数所能表示的最大十进制数)
    private long maxWorkerId = -1L ^ (-1L << workerIdBits);

    //支持的最大数据标识id，结果是31
    private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

    //序列在id中占的位数
    private long sequenceBits = 12L;

    //机器ID的偏移量(12)
    private long workerIdShift = sequenceBits;

    //数据中心ID的偏移量(12+5)
    private long datacenterIdShift = sequenceBits + workerIdBits;

    //时间截的偏移量(5+5+12)
    private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;

    //生成序列的掩码，这里为4095 (0b111111111111=0xfff=4095)
    private long sequenceMask = -1L ^ (-1L << sequenceBits);

    //上次生成ID的时间截
    private long lastTimestamp = -1L;

    public long getWorkerId(){
        return workerId;
    }

    public long getDatacenterId(){
        return datacenterId;
    }

    public long getTimestamp(){
        return System.currentTimeMillis();
    }

    public synchronized long nextId() {
        long timestamp = timeGen();

        if (timestamp < lastTimestamp) {
            System.err.printf("clock is moving backwards.  Rejecting requests until %d.", lastTimestamp);
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds",
                    lastTimestamp - timestamp));
        }

        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0;
        }

        lastTimestamp = timestamp;
        return ((timestamp - twepoch) << timestampLeftShift) |
                (datacenterId << datacenterIdShift) |
                (workerId << workerIdShift) |
                sequence;
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private long timeGen(){
        return System.currentTimeMillis();
    }

    //---------------测试---------------
    public static void main(String[] args) {
        IdWorker worker = new IdWorker(1,1,1);
        for (int i = 0; i < 30; i++) {
            System.out.println(worker.nextId());
        }
        //请问如何反推机器ID、数据中心ID和创建的时间戳呢？
        //机器ID = id >> workerIdShift & ~(-1L << workerIdBits)

        //数据中心ID = id >> datacenterIdShift & ~(-1L << datacenterIdBits);
    }
}
