package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/5 16:28
 * @Version: 1.0
 */
public class Title367 {

    public boolean isPerfectSquare(int num) {

        if (1 == num) {
            return true;
        }
        long low = 1;
        long high = num / 2;
        long mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            long result = mid * mid;
            if (result > num) {
                high = mid - 1;
            } else if (result < num) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean isPerfectSquare2(int num) {

        if (1 == num) {
            return true;
        }
        for (int i = 1; i < num / 2; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Title367().isPerfectSquare(9));
    }
}
