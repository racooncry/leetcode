package algorithm.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yxw
 * @Date: 2018/11/21 9:24
 * @Description:
 * @Version 1.0
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 */
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for (int i : nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i++]) {
                return false;
            }
        }
        return true;
    }

//0,2,1,3,2
    //2,0,1,3,2
    //5,
    public boolean containsDuplicate3(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
       // int[] nums={3,1,2,1};
        int[] nums={0,2,1,3,2};
        System.out.println(new Solution217().containsDuplicate3(nums));
    }
}
