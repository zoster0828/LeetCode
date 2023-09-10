class Solution {
    public int countTriples(int n) {
        int result = 0;
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j < i ; j++) {
                for(int k = 1 ; k < i ; k++) {
                    if(j == k) {
                        continue;
                    }
                    
                    if(i*i == j*j + k*k) {
                        result++;
                    }
                }
            }
        }
        
        return result;
    }
}