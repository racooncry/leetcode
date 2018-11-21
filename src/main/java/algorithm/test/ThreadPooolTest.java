package algorithm.test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author: yxw
 * @Date: 2018/10/31 13:37
 * @Description:
 * @Version 1.0
 */
public class ThreadPooolTest {
     public static int k=0;
    public static LongAdder longAdde = new LongAdder();

    public static void main(String[] args) throws InterruptedException {
        int size = 20000;
        CountDownLatch countDownLatch = new CountDownLatch(size);
        INNCTesr2 inncTesr2=new INNCTesr2(0);
        long start=System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(size);
        for (int i = 0; i < size; i++) {
          //executor.execute(new IINCTest(longAdde,countDownLatch));
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    inncTesr2.increate();
                }
            });
        }
       countDownLatch.await();
       executor.shutdown();
     //   System.out.println(longAdde);

        System.out.println(inncTesr2.get());
        System.out.println(System.currentTimeMillis()-start+"ms");


    }
}


class INNCTesr2 {
    private int  i;
    public INNCTesr2(int i) {
        this.i = i;
    }
    public int get(){
        return i;
    }
    public  synchronized void increate(){
       i++;
    }
}



class IINCTest implements Runnable {

    private LongAdder longAdde;
    private CountDownLatch countDownLatch;

    public IINCTest(LongAdder longAdde, CountDownLatch countDownLatch) {
        this.longAdde = longAdde;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        longAdde.increment();
        countDownLatch.countDown();
    }
}