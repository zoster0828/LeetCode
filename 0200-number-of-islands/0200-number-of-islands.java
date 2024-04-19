class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int h = 0 ; h < grid.length ; h++){
            for(int w = 0 ; w < grid[0].length ; w++){
                if(grid[h][w] == '1'){
                    count++;
                    find(grid, w, h);
                }
            }
        }

        return count;
    }

    public void find(char[][] grid, int w, int h) {
        if(grid[h][w] == '0') {return;}
        if(grid[h][w] == '1') {
            grid[h][w] = '0';
        }

        if(w > 0) {
            find(grid, w-1, h);
        }

        if(grid[0].length - 1 > w) {
            find(grid, w+1, h);
        }

        if(grid.length - 1 > h) {
            find(grid, w, h+1);
        }

        if(h > 0) {
            find(grid, w, h-1);
        }
    }
}