class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        
        for(int i = 0 ; i < grid.length ; i++) {
            int prev = 0;
            for(int j = 0 ; j < grid[i].length ; j++) {
                result += prev ^ grid[i][j];
                prev = grid[i][j];
            }
            result += prev;
        }
        
        for(int i = 0 ; i < grid[0].length ; i++) {
            int prev = 0;
            for(int j = 0 ; j < grid.length ; j++) {
                result += prev ^ grid[j][i];
                prev = grid[j][i];
            }
            result += prev;
        }
        
        return result;
    }
} 