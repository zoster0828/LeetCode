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
        sum += grid[i][j];        
        visited[i][j] = true;
        
        if(i!=0 && grid[i-1][j] != 0 && !visited[i-1][j]) get(sum, grid, i-1, j, visited);
        if(j!=0 && grid[i][j-1] != 0 && !visited[i][j-1]) get(sum, grid, i, j-1, visited);
        if(i!=grid.length-1 && grid[i+1][j] != 0 && !visited[i+1][j]) get(sum, grid, i+1, j, visited);
        if(j!=grid[0].length-1 && grid[i][j+1] != 0 && !visited[i][j+1]) get(sum, grid, i, j+1, visited);
        
        visited[i][j] = false;
        max = Math.max(max, sum);
    }
}