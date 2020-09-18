package main.java.algorithm.power;

/**
 * @Author yangxw
 * @Date 2020-09-16 上午9:42
 * @Description
 * @Version 1.0
 */
public class Soul231 {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        }
        return false;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n <= 0) {
            return false;
        }
        if (((n - 1) & n) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(0 % 2);
    }
}
