class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3) {
            return 0;
        }

        int r = grid.length;
        int c = grid[0].length;

        int result = 0;
        for(int row = 0 ; row < r-2 ; row ++) {
            for(int col = 0 ; col < c-2 ; col ++) {
                boolean[] nine = new boolean[16];

                int row1 = grid[row][col] + grid[row][col+1] + grid[row][col+2];
                if(row1 != 15) continue;
                int row2 = grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2];
                if(row2 != 15) continue;
                int row3 = grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2];
                if(row3 != 15) continue;
                int col1 = grid[row][col] + grid[row+1][col] + grid[row+2][col];
                if(col1 != 15) continue;
                int col2 = grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1];
                if(col2 != 15) continue;
                int col3 = grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2];
                if(col3 != 15) continue;
                int diagonal1 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
                if(diagonal1 != 15) continue;
                int diagonal2 = grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col];
                if(diagonal2 != 15) continue;

                nine[grid[row][col]] = true;
                nine[grid[row][col+1]] = true;
                nine[grid[row][col+2]] = true;
                nine[grid[row+1][col]] = true;
                nine[grid[row+1][col+1]] = true;
                nine[grid[row+1][col+2]] = true;
                nine[grid[row+2][col]] = true;
                nine[grid[row+2][col+1]] = true;
                nine[grid[row+2][col+2]] = true;

                boolean ok = true;
                for(int i = 1 ; i < 10 ; i++) {
                    if(!nine[i]) {
                        ok = false;
                        break;
                    }
                }

                if(ok)
                    result++;
            }
        }

        return result;
    }
}