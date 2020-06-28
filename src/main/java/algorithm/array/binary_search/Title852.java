package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/4 16:26
 * @Version: 1.0
 */
public class Title852 {

    public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid - 1] > A[mid] && A[mid] > A[mid + 1]) {
                high = mid - 1;
            } else if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return mid;
    }


    public static void main(String[] args) {
        int[] arr={0,1,2,1,0};
        System.out.println(new Title852().peakIndexInMountainArray(arr));
    }
}
