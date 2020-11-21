package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/10/10 9:53
 * @Description:
 * @Version 1.0
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
//        int[] min = nums;
//        int max = 0;
//        int diff = 0;
//        for (int i = 0, size = nums.length; i < size; i++) {
//            if () {
//
//            } else {
//                int[] numNow;
//                diff = sum(numNow) - sum(min);
//                if (max < diff) {
//                    max = diff;
//                }
//            }
//        }

        return 0;
    }

    /**
     * 暴力循环法
     *
     * @param nums
     * @return
     */
    public static int force(int[] nums) {
        int size = nums.length;
        if (size == 1) {
            return nums[0];
        }

        int ans = nums[0];
        int maxHead = nums[0];
        int maxOne = nums[0];
        //-2, 1, -3, 4, -1, 2, 1, -5, 4
        for (int i = 0; i < size; i++) {

            int maxNext = nums[i];
            for (int j = i + 1; j < size; j++) {
                maxNext += nums[j];
                maxOne = Math.max(maxNext, maxOne);
            }
            maxHead = nums[i];
            ans = Math.max(maxHead, ans);
            ans = Math.max(ans, maxOne);
            System.out.println("maxHead:" + maxHead + ",maxOne:" + maxOne + ",ans:" + ans);
        }

        return ans;
    }


    public static int force2(int[] nums) {
        int size = nums.length;

        int max = nums[0];
        int sum = nums[0];
        //-2, 1, -3, 4, -1, 2, 1, -5, 4
        for (int i = 1; i < size; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }


    private int sum(int[] nums) {
        int sum = 0;
        for (int i = 0, size = nums.length; i < size; i++) {
            sum += nums[i];
        }
        return sum;
    }


    private static final int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    /**
     * 滑动窗口
     *
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
                continue;
            }

        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //  int[] nums = {-1,0,-2};
        System.out.println(maxSubArray2(nums));

    }

}
