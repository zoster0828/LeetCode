class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        
        for(int w = 0 ; w < matrix.length ; w++) {
            for(int h = 0 ; h < matrix[0].length ; h++) {
                result[h][w] = matrix[w][h];
            }
        }
        
        return result;
    }
}