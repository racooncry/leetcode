package main.java.algorithm.array;

/**
 * @Author yangxw
 * @Date 11/9/2020 上午8:41
 * @Description
 * @Version 1.0
 */
public class Sol268 {
    public int missingNumber(int[] nums) {
        int leng = nums.length;
        int sum = (leng + 1) * leng / 2;
        for (int i = 0; i < leng; i++) {
            sum -= nums[i];
        }
        return sum;
    }


    public static int missingNumber2(int[] nums) {

        boolean[] flag = new boolean[nums.length + 1];
        int i;
        for (i = 0; i < nums.length; i++) {
            flag[nums[i]] = true;
        }
        for (i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {0};
        int i = missingNumber2(arr);
        System.out.println(i);
    }
}
