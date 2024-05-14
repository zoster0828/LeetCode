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
    
    int get(int sum, int[][] grid, int i, int j, boolean[][] visited) {
        if(visited[i][j] || grid[i][j] == 0) {
            max = Math.max(max, sum);
            return 0;
        }
            
        sum += grid[i][j];        
        visited[i][j] = true;
        
        if(i != 0) get(sum, grid, i-1, j, visited);
        if(j != 0) get(sum, grid, i, j-1, visited);
        if(i != grid.length-1) get(sum, grid, i+1, j, visited);
        if(j != grid[0].length-1) get(sum, grid, i, j+1, visited);
        
        max = Math.max(max, sum);
        visited[i][j] = false;
        return 0;
    }
}