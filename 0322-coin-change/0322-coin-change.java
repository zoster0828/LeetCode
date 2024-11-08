class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for(int i = 1 ; i < amount+1 ; i++) {
            int min = 10001;
            for(int j = 0 ; j < n ; j++) {
                if(i-coins[j] >= 0)
                    min = Math.min(min, dp[i-coins[j]] + 1);
            }
            dp[i] = min;
        }

        return dp[amount] != 10001 ? dp[amount] : -1;
    } 
}
