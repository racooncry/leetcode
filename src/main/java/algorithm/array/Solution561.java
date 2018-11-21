package algorithm.array;

import java.util.Arrays;

/**
 * @Author: yxw
 * @Date: 2018/10/9 11:31
 * @Description:
 * @Version 1.0
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,4,3,2]
 * <p>
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 * 提示:
 * <p>
 * n 是正整数,范围在 [1, 10000].
 * 数组中的元素范围在 [-10000, 10000].
 */
public class Solution561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int sum = 0;
        for (int i = 0; i < size; i+=2) {
            if ((i & 1) != 1) {
                sum += nums[i];
            }
        }
        return sum;
    }


}
