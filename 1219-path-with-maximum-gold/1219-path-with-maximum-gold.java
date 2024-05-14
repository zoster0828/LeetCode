class Solution {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        for(int i = 0 ; i < grid.length ; i++) {
            for(int j = 0 ; j < grid[0].length ; j++) {
                if(grid[i][j] == 0) continue;
                
                get(0, grid, i, j, new boolean[grid.length][grid[i].length]);
            }
        }        
        return max;
    }
    
    void get(int sum, int[][] grid, int i, int j, boolean[][] visited) {
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || visited[i][j] || grid[i][j] == 0 ) {
            max = Math.max(max, sum);
            return ;
        }
            
        sum += grid[i][j];        
        visited[i][j] = true;
        
        get(sum, grid, i-1, j, visited);
        get(sum, grid, i, j-1, visited);
        get(sum, grid, i+1, j, visited);
        get(sum, grid, i, j+1, visited);
        
        visited[i][j] = false;        
    }
}