package algorithm.array.binary_search;

import java.util.*;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/4 17:06
 * @Version: 1.0
 */
public class Title349 {

    public int[] intersectionSet(int[] nums1, int[] nums2) {
        if(null==nums1||null==nums2||nums1.length==0||nums2.length==0){
            return new int[0];
        }
        Set setNums1 = new HashSet<>();
        Set result = new HashSet();
        for (int value : nums1) {
            setNums1.add(value);
        }
        for (int value : nums2) {
            //set的底层是HashMap,map存储是数组+链表，找到数组的位置是O(1),在链表是顺序查找
            if (setNums1.contains(value)) {
                result.add(value);
            }
        }
        int[] res = new int[result.size()];
        int i=0;
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            res[i++]= (int) iterator.next();
        }
        return res;
    }

    public int[] intersectionMap(int[] nums1, int[] nums2) {
        if(null==nums1||null==nums2||nums1.length==0||nums2.length==0){
            return new int[0];
        }
        //注意初始化大小，否则会引起频繁扩容
        Map setNums1 = new HashMap();
        Map result = new HashMap();
        for (int value : nums1) {
            setNums1.put(value,null);
        }
        for (int value : nums2) {
            if (setNums1.containsKey(value)) {
                result.put(value,null);
            }
        }
        int[] res = new int[result.size()];
        int i=0;
        Iterator iterator = result.keySet().iterator();
        while (iterator.hasNext()) {
            res[i++]=  (int)iterator.next();
        }
        return res;
    }



    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] arr=new Title349().intersectionMap(nums1,nums2);
        for(int value:arr){
            System.out.println(value);
        }

        int[] nums3={4,9,5};
        int[] nums4={9,4,9,8,4};
        int[] arr2=new Title349().intersectionMap(nums3,nums4);
        for(int value:arr2){
            System.out.println(value);
        }
    }

}
