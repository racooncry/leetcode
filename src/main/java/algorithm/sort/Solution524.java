package algorithm.sort;

import java.util.List;

/**
 * @Author: yxw
 * @Date: 2018/8/24 9:28
 * @Description: 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 * 不止一个，返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * <p>
 * 输出:
 * "apple"
 * 示例 2:
 * <p>
 * 输入:
 * s = "abpcplea", d = ["a","b","c"]
 * <p>
 * 输出:
 * "a"
 * 说明:
 * <p>
 * 所有输入的字符串只包含小写字母。
 * 字典的大小不会超过 1000。
 * 所有输入的字符串长度不会超过 1000。
 * @Version 1.0
 */
public class Solution524 {

    public String findLongestWord(String s, List<String> d) {
        String longest = "";
        for (String str : d) {
            int i = 0;
            for (char c : s.toCharArray()) {
                if (i < str.length() && str.charAt(i) == c) {
                    i++;
                }
            }
            if (i == str.length() && str.length()>=longest.length()) {
                if(str.length()>longest.length() || str.compareTo(longest)<0) {
                    longest = str;
                }
            }
        }
        return longest;
    }


    public static void main(String[] args) {

        System.out.println("abc".compareTo("a"));


    }
}
