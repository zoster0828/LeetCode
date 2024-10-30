class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];

        for(int r = 0 ; r < row ; r++) {
            for(int c = 0  ; c < col ; c++) {
                if(obstacleGrid[r][c] == 1) {
                    dp[r][c] = 0;
                    continue;
                } 

                if(r == 0 && c == 0) {
                    dp[r][c] = 1;
                    continue;
                }

                dp[r][c] = (r != 0 ? dp[r-1][c] : 0) + (c != 0 ? dp[r][c-1] : 0);
            }
        }

        return dp[row-1][col-1];
    }
}