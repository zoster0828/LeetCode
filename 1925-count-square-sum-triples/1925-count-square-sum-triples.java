class Solution {
    public int countTriples(int n) {
        int result = 0;
        for(int i = 1 ; i <= n ; i++) {
            int square = i*i;
            for(int j = 1 ; j < i ; j++) {
                int a = j*j;
                for(int k = 1 ; k < j ; k++) {
                    if(square < a + k*k) {
                        break;
                    }
                    
                    if(square == a + k*k) {
                        result+=2;
                        break;
                    }
                }
            }
        }
        
        return result;
    }
}