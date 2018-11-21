package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/10/26 9:07
 * @Description:
 * @Version 1.0
 * <p>
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class Solution268 {


    public int missingNumber(int[] nums) {

        int size = nums.length;
        int[] bitMap = new int[size];
        for (int i = 0; i < size; i++) {

            if (nums[i] == 0) {
                bitMap[0] = 1;
                continue;
            }
            bitMap[nums[i]-1] = 1;

        }
        for (int i = 0; i < size; i++) {
            int num = bitMap[i];
            if (num == 0) {
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       // int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr = { 0};
        System.out.println(new Solution268().missingNumber(arr));

    }


}


class BitMap268 {

    private byte[] bytes;


}