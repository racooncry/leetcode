package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/19 7:58
 * @Version: 1.0
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class Title34 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if (nums.length == 1) {
            if (nums[0] == target) {
                res[0] = 0;
                res[1] = 0;
                return res;
            }
        }
        int l = 0, r = nums.length - 1, mid, begin = 0, end = 0;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                for (int i = mid; i >= l; i--) {
                    if (nums[i] == target) {
                        begin++;
                    }
                }
                for (int j = mid; j <= r; j++) {
                    if (nums[j] == target) {
                        end++;
                    }
                }
                System.out.println("mid:" + mid + ",begin:" + begin + ",end：" + end);
                if (begin == 0 && end == 0) {
                    res[0] = -1;
                    res[1] = -1;
                } else {
                    res[0] = mid - begin+1;
                    res[1] = mid + end-1;
                }
                return res;
            }

        }
        res[0] = -1;
        res[1] = -1;
        return res;

    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;


        int[] res = new Title34().searchRange(nums, target);
        for (int i : res) {
            System.out.println(i);
        }


    }

}
