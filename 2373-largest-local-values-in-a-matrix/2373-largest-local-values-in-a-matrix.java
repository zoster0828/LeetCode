class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];
        
        for(int i = 0 ; i < n-2; i++) {
            for(int j = 0 ; j < n-2 ; j++) {
                int biggest = getBiggest(grid, i, j);
                result[i][j] = biggest;
            }
        }
        
        return result;
    }
    
    int getBiggest(int[][] grid, int i, int j) {
        int max = 0;
        for(int height = 0 ; height < 3 ; height++) {
            for(int width = 0 ; width < 3; width++) {
                int value = grid[i+height][j+width];
                max = Math.max(value, max);
            }
        }
        
        return max;
    }
}