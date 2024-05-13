class Solution {
    public int matrixScore(int[][] grid) {
        for(int row = 0 ; row < grid.length ; row++) {
            if(grid[row][0] == 0) {
                rowFlip(grid[row]);
            }
        }

        for(int col = 1 ; col < grid[0].length ; col++) {
            colFlip(grid, col);
        }


        int result = 0;
        for(int row = 0 ; row < grid.length ; row++) {
            result += rowToNum(grid[row]);
        }

        return result;
    }

    void rowFlip(int[] grid) {
        for(int i = 0 ; i < grid.length ; i++){
            grid[i] = (grid[i] == 0 ? 1 : 0);
        }
    }

    void colFlip(int[][] grid, int col) {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++) {
            count += grid[i][col];
        }

        if(count <= grid.length/2) {
            for(int i = 0 ; i < grid.length ; i++){
                grid[i][col] = (grid[i][col] == 0 ? 1 : 0);
            }
        }
    }

    int rowToNum(int[] grid) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < grid.length ; i++){
            builder.append(grid[i]);
        }

        return Integer.parseInt(builder.toString(), 2);
    }
}