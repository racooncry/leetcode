package main.java.algorithm.array;

/**
 * @Author yangxw
 * @Date 2020-12-26 上午10:21
 * @Description
 * @Version 1.0
 */
public class Solution17_10 {

    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                count++;
            } else {
                count--;
                if (count <= 0) {
                    major = nums[i];
                    count = 1;
                }
            }
        }

        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == major) {
                number++;
            }
        }


        if (number > nums.length / 2) {
            return major;
        }
        return -1;
    }


    public static void main(String[] args) {
        // int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr = {1, 2, 3};
        // int[] arr = {3, 2, 3};
        // int[] arr = {3, 2};
        int i = new Solution17_10().majorityElement(arr);
        System.out.println(i);

    }
}
