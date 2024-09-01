class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {        
        int[][] result = new int[m][n];
        
        int l = original.length;        

        if(l != m*n) return new int[0][0];

        int row = 0;
        int col = 0;
        for(int i = 0 ; i < l ; i++) {
            result[row][col] = original[i];
            col++;
            if(col == n) {
                row++;
                col=0;
            }
        }

        return result;
    }
}