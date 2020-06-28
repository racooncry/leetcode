package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/13 9:28
 * @Version: 1.0
 */
public class Title162 {
    public int findPeakElement(int[] nums) throws InterruptedException {

        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = low + (high - low) /2;
               System.out.println("low:" + low + ",mid:" + mid + ",high:" + high);
                        Thread.sleep(1000);
            if (nums[mid + 1] > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] nums = {1, 2, 3, 1};
        //   int[] nums2={0,2,1,0};
        //   System.out.println("low:" + low + ",mid:" + mid + ",high:" + high);
        //            Thread.sleep(1000);
        System.out.println(new Title162().findPeakElement(nums));
    }
}
