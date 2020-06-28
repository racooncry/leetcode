package main.java.algorithm.dynamic_plan;

/**
 * @Author yangxw
 * @Date 2019/10/17 15:43
 * @Description
 * @Version 1.0
 */
public class DynamicPlanBLIBLI1 {


    /**
     * overlap sub-problem
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


    public static int fib2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int sum1 = 1;
        int sum2 = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = sum1 + sum2;
            sum2 = sum1;
            sum1 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
        System.out.println(fib2(n));

    }


}
