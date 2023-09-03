class Solution {
    public int uniquePaths(int m, int n) {
        int[][] obstacleGrid = new int[m][n];
        int x = obstacleGrid[0].length;
        int y = obstacleGrid.length;
        int dp[][] = new int[y][x];
        for(int column = 0 ; column < y ; column++) {
            for(int row = 0 ; row < x ; row++) {
                if(row == 0 && column == 0) {
                    dp[column][row] = 1;
                    continue;
                }

                dp[column][row] = (column-1 < 0 ? 0 : dp[column-1][row]) + (row-1 < 0 ? 0 : dp[column][row-1]);
            }
        }

        return dp[y-1][x-1];
    }
}