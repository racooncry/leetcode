package main.java.algorithm.string;

/**
 * @Author yangxw
 * @Date 10/9/2020 上午9:24
 * @Description
 * @Version 1.0
 */
public class Str242 {

    public boolean isAnagram(String s, String t) {
        int[] statS = new int[26];
        int[] statT = new int[26];
        int i = 0;
        for (i = 0; i < statS.length; i++) {
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                int index = chars[j] - 'a';
                statS[index]++;
            }
        }
        for (i = 0; i < statT.length; i++) {
            char[] chars = t.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                int index = chars[j] - 'a';
                statT[index]++;
            }
        }

        for (i = 0; i < 26; i++) {
            if (statS[i] != statT[i]) {
                return false;
            }
        }
        return true;
    }
}
