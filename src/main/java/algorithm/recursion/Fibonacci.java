package main.java.algorithm.recursion;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午8:13
 * @Description
 * @Version 1.0
 */
public class Fibonacci {


    public static int fib(int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        int sum = fib(N - 1) + fib(N - 2);
        return sum;
    }

    public static int fib2(int N) {
        if (N <= 1) {
            return N;
        }

        if (N == 2) {
            return 1;
        }

        int fn = 0;
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 3; i <=N; i++) {
            fn = prev1 + prev2;
            prev2 = prev1;
            prev1 = fn;
        }
        return fn;
    }


    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib2(5));
    }

}
