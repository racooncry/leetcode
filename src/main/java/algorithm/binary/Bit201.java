package main.java.algorithm.binary;

/**
 * @Author yangxw
 * @Date 7/9/2020 上午8:44
 * @Description
 * @Version 1.0
 */
public class Bit201 {

    public int rangeBitwiseAnd2(int m, int n) {
        int result = m;
        for (int i = m; i <= n; i++) {
            result = (result & i);
        }
        return result;
    }


    /**
     * 找出最高位
     *
     * @param m
     * @return
     */
    public int msb(int m) {
        int count = 0;
        while (m > 0) {
            m = m >> 1;
            count++;
        }
        return count - 1;
    }

    /**
     * 第index位置设为1
     *
     * @param result
     * @param index
     * @return
     */
    public int setIndexBit1(int result, int index) {
        return (result | (1 << index));
    }

    /**
     * 第index位置设为0
     *
     * @param result
     * @param index
     * @return
     */
    public int setIndexBit0(int result, int index) {
        return (result & ~(1 << index));
    }

    /**
     * 查看第i位是不是1
     *
     * @param result
     * @param index
     * @return
     */
    public int getIndexBit(int result, int index) {
        return (result >> index) & 1;
    }


    public int rangeBitwiseAnd(int m, int n) {
        int msb1 = msb(m);
        int msb2 = msb(n);
        if (msb1 != msb2) {
            return 0;
        }
        int result = 0;
        int msb = msb1;
        while (msb >= 0) {
            int x = getIndexBit(m, msb);
            int y = getIndexBit(n, msb);
            if (x != y) {
                return result;
            }
            if (x == 1) {
                result = setIndexBit1(result, msb);
            }
            msb--;
        }
        return result;
    }

    public int rangeBitwiseAnd3(int m, int n) {
        int msb1 = msb(m);
        int msb2 = msb(n);
        if (msb1 != msb2) {
            return 0;
        }
        int count = 0;
        while (n > m) {
            if (count > msb1) {
                break;
            }
            n = setIndexBit0(n, count);
            count++;
        }
        return n;
    }


    public static void main(String[] args) {
        Bit201 bit201 = new Bit201();
//        int msb = bit201.msb(8);
//        System.out.println(msb);
//
//        int setBit = bit201.setIndexBit(11, 2);
//        System.out.println(setBit);
//
//        int getBitIndex = bit201.getIndexBit(11, 2);
//        System.out.println(getBitIndex);

        int setIndexBit0 = bit201.setIndexBit0(11, 1);
        System.out.println(setIndexBit0);

        int i = bit201.rangeBitwiseAnd(138, 142);
        System.out.println(i);

        int i2 = bit201.rangeBitwiseAnd3(138, 142);
        System.out.println(i2);


    }
}
