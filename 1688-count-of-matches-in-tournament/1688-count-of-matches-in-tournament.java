class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        
        while(n != 1) {            
            if(n%2 == 0) {                
                n/=2;
                result += n;                
                continue;
            }
            
            n/=2;
            result += n;
            n += 1;
        }
        
        return result;
    }
}