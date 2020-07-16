package main.java.algorithm.string.kmp;

import java.util.Arrays;

/**
 * @Author yangxw
 * @Date 15/7/2020 上午9:53
 * @Description
 * @Version 1.0
 */
public class KMP {


    private static void kmpSearch(char text[], char pattern[]) {
        int n = pattern.length;
        int[] prefix = new int[n];
        prefixTable(text, prefix, n);
        movePrefixTable(prefix, n);

        int m = text.length;
        // text[i] len(text)   =   m
        // prefix[j]  len(pattern) = n
        int i = 0;
        int j = 0;
        while (i < m) {
            if (j == n - 1 && text[i] == pattern[j]) {
                System.out.println("Print pattern at: " + (i - j));
                j = prefix[j];
            }
            if (text[i] == pattern[j]) {
                i++;
                j++;
            } else {
                j = prefix[j];
                if (j == -1) {
                    i++;
                    j++;
                }
            }
        }
    }


    private static void movePrefixTable(int prefix[], int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            prefix[i] = prefix[i - 1];
        }
        prefix[0] = -1;
    }

    private static void prefixTable(char pattern[], int prefix[], int n) {
        prefix[0] = 0;
        int len = 0;
        int i = 1;
        while (i < n) {
            //  System.out.println("i = " + i + " , len = " + len);
            if (pattern[i] == pattern[len]) {
                len++;
                prefix[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = prefix[len - 1];
                } else {
                    prefix[i] = len;
                    i++;
                }
            }
        }
    }


    public static void main(String[] args) {

        char pattern[] = "ABABCABAA".toCharArray();
        char text[] = "ABABABCABAABABABABABABCABAA".toCharArray();

        kmpSearch(text, pattern);
//        int n = pattern.length;
//        int[] prefix = new int[n];
//        prefixTable(pattern, prefix, n);
//
//        movePrefixTable(prefix, n);

//        System.out.println(Arrays.toString(prefix));

    }
}

