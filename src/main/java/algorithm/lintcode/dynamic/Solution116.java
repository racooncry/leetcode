package algorithm.lintcode.dynamic;

public class Solution116 {
    /**
     * @param A: A list of integers
     * @return: A boolean
     */
    public boolean canJump(int[] A) {
        // write your code here
        int n = A.length;
        boolean[] f = new boolean[n];
        f[0] = true;
        int i, j;
        for (i = 1; i < n; i++) {
            f[i] = false;
            for (j = 0; j < i; j++) {
                if (f[j] && A[j] + j >= i) {
                    f[i] = true;
                }
            }
        }
        return f[n - 1];
    }
}
