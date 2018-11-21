package algorithm.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: yxw
 * @Date: 2018/10/8 8:56
 * @Description:
 * @Version 1.0
 * <p>
 * <p>
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Solution905 {


    public int[] sortArrayByParity(int[] A) {
        int[]res = new int[A.length];
        int left=0;
        int right =A.length-1;
        for(int i =0;i<A.length;i++){
            if(A[i]%2==0){
                res[left++]=A[i];
            }else {
                res[right--]=A[i];
            }
        }
        return res;
    }


    public static void sortArrayByParity2(int[] A) {
        Deque deque=new LinkedList();
        for(int i =0;i<A.length;i++){
            if(A[i]%2==0){
                deque.addFirst(A[i]);
            }else {
                deque.addLast(A[i]);
            }
        }
        int[] B=new int[A.length];
        Iterator iterator=deque.iterator();
        int k=0;
        while (iterator.hasNext()){
            B[k++]=(int)iterator.next();
        }
        System.out.println(deque);

    }


    public static void main(String[] args) {

        Deque<Integer> mDeque = new ArrayDeque<Integer>();
        for (int i = 0; i < 5; i++) {
            mDeque.offer(i);
        }
        //System.out.println(mDeque.peek());
        System.out.println("***********集合方式遍历**********");                //集合方式遍历，元素不会被移除         for (Integer x : mDeque) {                 System.out.println(x);
        int[] arr=new int[3];

        mDeque.addLast(5);

        for (Integer x : mDeque) {
            System.out.println(x);
        }


       sortArrayByParity2(new int[]{3,1,2,4});
    }


}
