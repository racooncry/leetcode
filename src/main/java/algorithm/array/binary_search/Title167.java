package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/4 17:55
 * @Version: 1.0
 */
public class Title167 {


    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int[] res = new int[2];
        while (low <= high) {
            if (numbers[low] + numbers[high]> target) {
                high = high - 1;

            } else if (numbers[low] + numbers[high] < target) {
                low = low + 1;
            } else {
                break;
            }
        }
        res[0] = low+1;
        res[1] = high+1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        System.out.println(new Title167().twoSum(arr,18)[1]);
    }

}
