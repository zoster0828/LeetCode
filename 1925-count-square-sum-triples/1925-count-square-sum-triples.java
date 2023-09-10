class Solution {
    public int countTriples(int n) {
        int result = 0;
        for(int i = 1 ; i <= n ; i++) {
            int square = i*i;
            for(int j = 1 ; j < i ; j++) {
                for(int k = 1 ; k < i ; k++) {
                    if(j == k) {
                        continue;
                    }
                    if(square < j*j + k*k) {
                        break;
                    }
                    
                    if(square == j*j + k*k) {
                        result++;
                    }
                }
            }
        }
        
        return result;
    }
}