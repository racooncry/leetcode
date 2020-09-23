package main.java.algorithm.array;

/**
 * @Author yangxw
 * @Date 2020-09-23 上午11:36
 * @Description
 * @Version 1.0
 */
public class Solu13 {
    private static final char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private static final int[] nums = {1, 5, 10, 50, 100, 500, 1000};


    private int findValue(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                return nums[i];
            }
        }
        return 0;
    }


    private int findMaxIndex(char[] param, int left, int right) {
        int max = 0;
        int index = 0;
        for (int i = left; i <= right; i++) {
            int value = findValue(param[i]);
            if (value > max) {
                max = value;
                index = i;
            }
        }
        return index;
    }


    public int romanToInt(char[] param, int L, int R) {
        if (L == R) {
            return findValue(param[L]);
        } else if (L > R) {
            return 0;
        } else {
            int maxIndex = findMaxIndex(param, L, R);
            int mx = findValue(param[maxIndex]);
            int left = romanToInt(param, L, maxIndex - 1);
            int right = romanToInt(param, maxIndex + 1, R);
            return mx - left + right;
        }
    }

    public int test(String s) {
        char[] param = s.toCharArray();
        int left = 0;
        int right = param.length - 1;
        return romanToInt(param, left, right);
    }


    public static void main(String[] args) {
        Solu13 solu13 = new Solu13();
        String s = "MCMXCIV";
        System.out.println(solu13.test(s));
    }
}
