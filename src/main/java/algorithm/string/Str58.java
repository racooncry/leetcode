package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 29/6/2020 上午8:43
 * @Description
 * @Version 1.0
 */
public class Str58 {


    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        char[] chars = s.toCharArray();
        int size = chars.length;
        int i = size - 1;
        boolean skipSpace = true;
        while (i >= 0) {
            if (chars[i] == ' ') {
                if (!skipSpace) {
                    break;
                }
                i--;
                continue;
            }
            skipSpace = false;
            count++;
            i--;
            System.out.println(i);
        }
        return count;
    }

    public static int lengthOfLastWord2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0) {
            if (s.charAt(i--) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello "));
    }
}
