package algorithm.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: yxw
 * @Date: 2018/11/19 8:52
 * @Description:
 * @Version 1.0
 *
给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。

找到所有出现两次的元素。

你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？

示例：

输入:
[4,3,2,7,8,2,3,1]

输出:
[2,3]
 *
 */
public class Solution442 {


    public List<Integer> findDuplicates(int[] nums) {

        Set set = new HashSet(nums.length);
        List<Integer> list = new ArrayList<>();
        for (int i = 0, size = nums.length; i < size; i++) {
            int number = nums[i];
            if (set.contains(number)) {
                list.add(number);
            } else {
                set.add(number);
            }
        }
      return list;
    }

    public List<Integer> findDuplicates2(int[] nums) {
          int[] book=new int[nums.length+1];
          for(int i:nums){
              book[i]++;
          }
        List<Integer> list = new ArrayList<>();
        for (int j = 0, size = book.length; j < size; j++) {
            if (book[j] == 2) {
                list.add(j);
            }
        }
        return list;
    }
}
