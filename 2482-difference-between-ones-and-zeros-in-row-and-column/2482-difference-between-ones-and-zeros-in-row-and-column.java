class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int w = grid.length;
        int h = grid[0].length;
        int[] onesRow = new int[w];        
        int[] onesCol = new int[h];
        
        for(int i = 0 ; i < w ; i++) {            
            for(int j = 0 ; j < h ; j++) {
                if(grid[i][j] == 1) {
                    onesRow[i]++;
                }
            }
        }
        
        for(int i = 0 ; i < h ; i++) {            
            for(int j = 0 ; j < w ; j++) {
                if(grid[j][i] == 1) {
                    onesCol[i]++;
                }
            }
        }
        
        int result[][] = new int[w][h];
        
        for(int i = 0 ; i < result.length ; i++) {
            for(int j = 0 ; j < result[0].length ; j++) {
                result[i][j] = onesRow[i] + onesCol[j] - (w-onesRow[i]) - (h-onesCol[j]);
            }
        }
        
        return result;
    }
}