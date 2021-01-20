package algorithm.lintcode.dynamic;

public class Solution669 {

    /**
     * @param coins:  a list of integer
     * @param amount: a total amount of money amount
     * @return: the fewest number of coins that you need to make up
     */
    public static int coinChange(int[] coins, int amount) {
        // write your code here
        int[] f = new int[amount + 1];

        int n = coins.length;

        f[0] = 0;
        for (int i = 1; i <= amount; ++i) {
            f[i] = Integer.MAX_VALUE;
            // f[j] = min{ f[i-coins[0]]+1,...,f[i-coins[n-1]+1 }
            for (int j = 0; j < n; ++j) {

                if (i >= coins[j] && f[i - coins[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
                }

            }
        }
        if (f[amount] == Integer.MAX_VALUE) {
            f[amount] = -1;
        }

        return f[amount];

    }

    public static void main(String[] args) {
        int[] coins = {2, 5, 7};
        int m = 27;
        int change = coinChange(coins, m);
        System.out.println(change);


    }
}
