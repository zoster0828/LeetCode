class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        int x = grid[0].length;
        int y = grid.length;
        int dp[][] = new int[y][x];
        for(int i = 0 ; i < x ; i++) {
            dp[0][i] = 1;
        }
        for(int i = 0 ; i <y ; i++) {
            dp[i][0] = 1;
        }
        
        for(int i = 1 ; i < x ; i++) {
            for(int j = 1 ; j < y ; j++) {
                dp[j][i] = dp[j-1][i] + dp[j][i-1];
            }
        }
        
        return dp[y-1][x-1];
    }
}