package algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yxw
 * @Date: 2018/9/17 19:47
 * @Description:
 * @Version 1.0
 * <p>
 * <p>
 * 如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：
 * <p>
 * n >= 3
 * 对于所有 i + 2 <= n，都有 X_i + X_{i+1} = X_{i+2}
 * 给定一个严格递增的正整数数组形成序列，找到 A 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0 。
 * <p>
 * （回想一下，子序列是从原序列 A 中派生出来的，它从 A 中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如， [3, 5, 8] 是 [3, 4, 5, 6, 7, 8] 的一个子序列）
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: [1,2,3,4,5,6,7,8]
 * 输出: 5
 * 解释:
 * 最长的斐波那契式子序列为：[1,2,3,5,8] 。
 * 示例 2：
 * <p>
 * 输入: [1,3,7,11,12,14,18]
 * 输出: 3
 * 解释:
 * 最长的斐波那契式子序列有：
 * [1,11,12]，[3,11,14] 以及 [7,11,18] 。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 3 <= A.length <= 1000
 * 1 <= A[0] < A[1] < ... < A[A.length - 1] <= 10^9
 * （对于以 Java，C，C++，以及 C# 的提交，时间限制被减少了 50%）
 */
public class Solution873 {
    public int lenLongestFibSubseq(int[] A) {
        int maxLength = 0;
        int first;
        int sencond;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length - 1; j++) {
                first = A[i];
                sencond = A[j];
                int time = 0;
                for (int k = j + 1; k < A.length; k++) {
                    if (first + sencond == A[k]) {
                        first = sencond;
                        sencond = A[k];
                        time++;
                    }
                }
                if (time > maxLength) {
                    maxLength = time;
                }
            }

        }

        return maxLength > 0 ? maxLength + 2 : maxLength;
    }



    //1,2,3,4,5,6,7,8
    public int lenLongestFibSubseq3(int[] A) {
        int res = 0;
        int[][] dp = new int[A.length][A.length];
        Map<Integer, Integer> index = new HashMap<>();
        for (int j = 0; j < A.length; j++) {
            index.put(A[j], j);
            for (int i = 0; i < j; i++) {
                int k = index.getOrDefault(A[j] - A[i], -1);
                dp[i][j] = (A[j] - A[i] < A[i] && k >= 0) ? dp[k][i] + 1 : 2;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res > 2 ? res : 0;
    }











    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50};
        System.out.println(new Solution873().lenLongestFibSubseq(nums));
    }
}
