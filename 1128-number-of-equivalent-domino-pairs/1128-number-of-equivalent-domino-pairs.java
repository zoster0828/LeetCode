class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] dp = new int[10][10];
        int result = 0;

        for (int[] d : dominoes) {
            int a = d[0], b = d[1];
            if (a == b) {
                result += dp[a][a];
                dp[a][a]++;
            } else {
                result += dp[a][b] + dp[b][a];
                dp[a][b]++;
            }
        }
        return result;
    }
}
