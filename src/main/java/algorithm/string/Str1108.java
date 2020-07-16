package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 30/6/2020 下午12:29
 * @Description
 * @Version 1.0
 */
public class Str1108 {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int size = address.length();
        int i = 0;
        while (i < size) {
            char index = address.charAt(i++);
            if (index == '.') {
                sb.append("[.]");
            } else {
                sb.append(index);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
