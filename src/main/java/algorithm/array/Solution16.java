package algorithm.array;

import java.util.Arrays;

/**
 * @Author: yxw
 * @Date: 2018/9/20 19:40
 * @Description:
 * @Version 1.0
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
public class Solution16 {

    public int threeSumClosest(int[] nums, int target) {
        int size = nums.length;
        int minDiff = 0;
        int sum = 0;
        int count;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                minDiff = Math.abs(target - nums[i]);
                sum = sum + nums[i];
            } else {
                int diff = Math.abs(target - nums[i]);
                if (minDiff > diff) {
                    minDiff = diff;
                    sum = 0;
                    sum += nums[i];
                }
            }
        }

        return sum;
    }


    public int threeSumClosest2(int[] nums, int target) {
        int length = nums.length;
        if (length < 3) {
            return 0;
        }
        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int closeNum = 0;
        for (int i = 0; i < length - 2; i++) {
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                int diffTem = Math.abs(target - temp);
                if (diffTem < diff) {
                    diff = diffTem;
                    closeNum = temp;
                }
                if (temp > target) {
                    right--;
                } else if (temp < target) {
                    left++;
                } else {
                    return temp;
                }
            }
        }
        return closeNum;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        System.out.println(new Solution16().threeSumClosest2(nums, 1));

    }
}
