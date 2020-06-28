package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/5 15:15
 * @Version: 1.0
 */
public class Title704 {

    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int[] arr2={-1,0,3,5,9,12};
        System.out.println(new Title704().search(arr,9));
        System.out.println(new Title704().search(arr2, 2));

    }


}
