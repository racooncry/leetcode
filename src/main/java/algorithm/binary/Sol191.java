package main.java.algorithm.binary;

/**
 * @Author yangxw
 * @Date 2020-09-18 上午9:04
 * @Description
 * @Version 1.0
 */
public class Sol191 {


    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}
