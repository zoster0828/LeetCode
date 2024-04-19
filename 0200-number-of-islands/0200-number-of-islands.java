class Solution {
    int width = 0;
    int height = 0;
    public int numIslands(char[][] grid) {
        width = grid.length;
        height = grid[0].length;
        int count = 0;
        for(int w = 0 ; w < width ; w++){
            for(int h = 0 ; h < height ; h++){
                if(grid[w][h] == '1'){
                    count++;
                    find(grid, w, h);
                }
            }
        }

        return count;
    }

    public void find(char[][] grid, int w, int h) {
        
        grid[w][h] = '0';
        
        if(w > 0 && grid[w-1][h] == '1') {     
            find(grid, w-1, h);
        }

        if(height - 1 > h && grid[w][h+1] == '1') {
            find(grid, w, h+1);
        }

        if(width - 1 > w && grid[w+1][h] == '1') {
            find(grid, w+1, h);
        }

        if(h > 0 && grid[w][h-1] == '1') {
            find(grid, w, h-1);
        }
    }
}