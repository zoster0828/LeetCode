class Solution {
    public int countHomogenous(String s) {
        int result = 0;
        char prev = '1';
        int continuous = 0;
        for(char c : s.toCharArray()) {
            if(prev != c) {
                int fac = sum(continuous);
                result += fac;
                continuous = 1;
                prev = c;
            } else {
                continuous += 1;
            }
        }
        
        int fac = sum(continuous);
        result += fac;
        
        return result;
    }
    
    int sum(int num) {
        int result = 0;
        for(int i = 1 ; i <= num ; i++) {
            result += i;
            result = result %1000000007;
        }
        
        return result;
    }
}