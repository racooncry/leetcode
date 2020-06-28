package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/15 9:03
 * @Version: 1.0
 */
public class Title209 {


    public int minSubArrayLen(int s, int[] nums) {
        int minLength = -1;
        int minSum = -1;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int min = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {
                //如果是连续递增或者连续递减
                if ((nums[j - 1] > nums[j] && nums[j] > nums[j + 1]) || (nums[j - 1] < nums[j] && nums[j] < nums[j + 1])) {
                    sum += nums[j];
                    if (sum >= s) {
                        min = j - i;
                        continue;
                    }

                } else {
                    break;
                }
            }
            if (sum <= minSum && minSum > 0 && min < minLength && minLength > 0) {
                minSum = sum;
                minLength = min;
            }
        }
        return minLength == -1 ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int n=7;
        System.out.println(new Title209().minSubArrayLen(n,arr));

    }

}
