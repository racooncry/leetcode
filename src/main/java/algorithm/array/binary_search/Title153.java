package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/11 9:04
 * @Version: 1.0
 */
public class Title153 {

    public int findMin(int[] nums) {
//            System.out.println(low+","+mid+","+high);
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[high];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Title153().findMin(nums));
        System.out.println(new Title153().findMin(nums2));
    }
}