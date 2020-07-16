package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 29/6/2020 上午9:06
 * @Description
 * @Version 1.0
 */
public class Str709 {
    /**
     * @param str
     * @return
     */
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int size = str.length() - 1;
        int i = 0;
        while (i <= size) {
            char s = str.charAt(i++);
            if (s >= 'A' && s <= 'Z') {
                sb.append((char) ((int) s + 32));
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((int) 'a');
        System.out.println((int) 'A');
        System.out.println((char) ((int) 'A' + 32));
        System.out.println(toLowerCase("AcxcSADSA"));
    }
}
