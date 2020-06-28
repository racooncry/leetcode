package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/6 9:43
 * @Version: 1.0
 */
public class Title374 extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 1) {
                low = mid + 1;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                break;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(new Title374().guessNumber(10));
    }
}

class GuessGame {
    public int guess(int number) {
        int target = 6;
        if (number > target) {
            return -1;
        } else if (number < target) {
            return 1;
        } else {
            return 0;
        }
    }
}
