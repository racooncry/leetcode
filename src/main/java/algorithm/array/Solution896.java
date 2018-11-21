package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/10/30 9:47
 * @Description:
 * @Version 1.0
 *如果数组是单调递增或单调递减的，那么它是单调的。
 *
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 *
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 */
public class Solution896 {


    public boolean isMonotonic(int[] A) {
        int size = A.length;
        int k = 0;  //0:等于， 1：升序， 2：降序
        for (int i = 1; i < size; i++) {
            if (A[i] > A[i - 1]) {
                if (k == 0) {
                    k = 1;
                } else if (k==2) {
                    return false;
                }
            } else if (A[i] < A[i - 1]) {
                if (k == 0) {
                    k = 2;
                } else if (k==1) {
                    return false;
                }
            }

        }
        return true;

    }


    public boolean isMonotonic2(int[] A) {
        boolean inc = true, dec = true;
        int size = A.length;
        for(int i=0;i<size-1;i++){
            if (A[i] > A[i + 1]){
                inc = false;
            }
            if (A[i] < A[i + 1]){
                dec = false;
            }
        }
        return inc || dec;

    }



}
