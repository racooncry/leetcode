package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/18 8:10
 * @Version: 1.0
 */
public class Title33 {


    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target == nums[r]) {
                return r;
            }
            if (nums[mid] > nums[r]) {
                if (target > nums[r] && target <= nums[mid]) {
                    r = mid;
                } else if (target > nums[mid] || target < nums[r]) {
                    l = mid + 1;
                }
            } else {
                if (target > nums[r] || target < nums[mid]) {
                    r = mid - 1;
                } else if (target < nums[r] && target > nums[mid]) {
                    l = mid + 1;
                }
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        //  System.out.println("nums[" + l + "]:" + nums[l] + ",nums[" + mid + "]," + nums[mid] + ",nums[" + r + "]:" + nums[r]);
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr2 = {1, 3};
        int target = 2;
        System.out.println(new Title33().search(arr2, target));
    }


}
