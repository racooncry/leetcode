package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/9/17 9:02
 * @Description:
 * @Version 1.0
 */
public class FqnbArray {


    private long getSum(int n) {
        if (n < 3) {
            return 1;
        }
        return getSum(n - 1) + getSum(n - 2);
    }


    private long getSum(int first, int second, int n) {
        if (n < 3) {
            return 1;
        }
        if (n == 3) {
            return first + second;
        }
        return getSum(second, first + second, n - 1);
    }


    private long getSumCycle(int n) {
        long first = 1;
        long second = 1;
        long ret = 0;

        for (int i = 3; i <= n; i++) {
            ret = first + second;
            first = second;
            second = ret;
        }

        return second;
    }


    public static void main(String[] args) {

        int n = 10;

        System.out.println(new FqnbArray().getSum(1, 1, 10));


    }


}
