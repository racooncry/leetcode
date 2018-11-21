package algorithm.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: yxw
 * @Date: 2018/11/20 9:09
 * @Description:
 * @Version 1.0
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class Solution441 {


    public int thirdMax(int[] nums) {
        //  List<Integer> list=new ArrayList<>(3);
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            long number = nums[i];
            if ((number == max1) || (number == max2) || (number == max3)) {
                continue;
            }
            if (number > max1) {
                max3 = max2;
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max3 = max2;
                max2 = number;
            } else if (number > max3) {
                max3 = number;

            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }

}
