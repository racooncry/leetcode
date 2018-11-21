package algorithm.sort;

import java.util.Arrays;

/**
 * @Author: yxw
 * @Date: 2018/8/28 17:34
 * @Description: 给定一个无序的数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1, 5, 1, 1, 6, 4]
 * 输出: 一个可能的答案是 [1, 4, 1, 5, 1, 6]
 * 示例 2:
 * <p>
 * 输入: nums = [1, 3, 2, 2, 3, 1]
 * 输出: 一个可能的答案是 [2, 3, 1, 3, 1, 2]
 * 说明:
 * 你可以假设所有输入都会得到有效的结果。
 * <p>
 * 进阶:
 * 你能用 O(n) 时间复杂度和 / 或原地 O(1) 额外空间来实现吗？
 * @Version 1.0
 */
public class Solution324 {

    public void wiggleSort(int[] nums) {

        int[] sort = nums.clone();
        Arrays.sort(sort);
        for (int i = (sort.length - 1) / 2, j = 0; i >= 0; i--, j += 2) {
            nums[j] = sort[i];
        }
        for (int i = sort.length - 1, j = 1; i > (sort.length - 1) / 2; i--, j += 2) {
            nums[j] = sort[i];
        }

    }


}
