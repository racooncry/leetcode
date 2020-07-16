package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 30/6/2020 下午12:24
 * @Description
 * @Version 1.0
 */
public class Str58_2 {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = reverseLeftWords("cccccccccccaaaaa", 3);
        System.out.println(s);
    }
}
