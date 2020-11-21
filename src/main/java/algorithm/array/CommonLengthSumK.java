package main.java.algorithm.array;

/**
 * @Author yangxw
 * @Date 2020-09-26 上午10:57
 * @Description
 * @Version 1.0
 */
public class CommonLengthSumK {

    private static int[] arr = {1, 2, 1, 3, 1, 1, 1};
    private static int[] arr2 = {1, 1, 1, 9, 9, 1, 1, 1, 1};

    // <=k的最长连续子数组
    private static int countLength(int[] arr, int k) {
        // 滑动窗口算法
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum <= k) {
                count++;
            } else {
                sum = sum - arr[i - count];
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int i = countLength(arr2, 4);
        System.out.println(i);
    }


}
