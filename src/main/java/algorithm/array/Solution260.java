package algorithm.array;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/1/21 9:13
 * @Version: 1.0
 */
public class Solution260 {


    public int[] singleNumber(int[] nums) {
        int sum = 0;    //记录所有异或的值，即两个只出现一次数的异或
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        int[] res = new int[2];

        sum &= -sum;    //得出两个数异或结果的最右边的一个1，其他的为零，这样进行&操作就可以将两个不同的数分到不同的两组去
        for (int i = 0; i < nums.length; i++) {
            if ((sum & nums[i]) == 0) {
                res[0] ^= nums[i];
            } else {
                res[1] ^= nums[i];
            }
        }
        return res;
    }


    public int[] singleNumber2(int[] nums) {
        int sum = nums[0];
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            sum ^= nums[i];
        }
        int[] res = new int[2];
        sum = sum & (~(sum - 1));
        for (int i = 0; i < size; i++) {
            if ((sum ^ nums[i]) == 0) {
                res[0] = res[0] ^ nums[i];
            } else {
                res[1] = res[1] ^ nums[i];
            }
        }

        return res;


    }


    public static void main(String[] args) {


        System.out.println((~9));

    }
}
