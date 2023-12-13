class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0 ;
        for(int i = 0 ; i < mat.length ; i++) {
            for(int j = 0 ; j < mat[0].length ; j++) {
                if(mat[i][j] == 1) {
                    if(isSpecial(mat, i, j)) {
                        result++;
                    }
                }
            }
        }
        
        return result;
    }
    
    boolean isSpecial(int[][] mat, int h, int w) {
        
        for(int i = h -1 ; i >= 0 ; i--) {
            if(mat[i][w] == 1) {
                return false;
            }
        }
        
        for(int i = w -1 ; i >= 0 ; i--) {
            if(mat[h][i] == 1) {
                return false;
            }
        }
        
        for(int i = h +1 ; i < mat.length ; i++) {
            if(mat[i][w] == 1) {
                return false;
            }
        }
        
        for(int i = w +1 ; i < mat[0].length ; i++) {
            if(mat[h][i] == 1) {
                return false;
            }
        }
        return true;
    }
}