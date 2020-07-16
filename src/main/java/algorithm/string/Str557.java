package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 28/6/2020 上午9:32
 * @Description
 * @Version 1.0
 */
public class Str557 {


    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, size = split.length; i < size; i++) {
            if (i == 0) {
                stringBuilder.append(reverse(split[i]));
            } else {
                stringBuilder.append(" ");
                stringBuilder.append(reverse(split[i]));
            }
        }

        return stringBuilder.toString();
    }


    public String reverse(String s) {
        if (null == s) {
            return null;
        }
        char[] chars = s.toCharArray();
        char[] copy = new char[chars.length];
        int i = 0;
        while (i < chars.length) {
            copy[i] = chars[chars.length - i - 1];
            i++;
        }
        return new String(copy);
    }

    public static void main(String[] args) {
        String param = "Let's take LeetCode contest";
        Str557 str557 = new Str557();
        System.out.println(str557.reverseWords(param));
    }
}
