package algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: yxw
 * @Date: 2018/10/9 11:03
 * @Description:
 * @Version 1.0
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return res;
        }
        helper(res, temp, nums, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int[] nums, int index) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
       List<List<Integer>> res=new Solution78().subsets(nums) ;
        Iterator<List<Integer>> it1=res.iterator();
        while(it1.hasNext())
        {
            List<Integer> list2=it1.next();
            Iterator<Integer> it2=list2.iterator();
            while(it2.hasNext())
            {
                int result=it2.next();
                System.out.print(result+" ");
            }
            System.out.println();
        }

      //  System.out.println(Arrays.toString(nums));
    }


}
