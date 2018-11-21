package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/10/23 20:36
 * @Description:
 * @Version 1.0
 */
public class Solution283 {


    public void moveZeroes(int[] nums) {
        int index = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (0 != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        for(int i=index;i<length;i++){
            nums[i]=0;
        }



    }


    public static void main(String[] args) {


    }
}
