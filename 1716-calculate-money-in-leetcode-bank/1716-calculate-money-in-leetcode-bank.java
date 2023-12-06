class Solution {
    public int totalMoney(int n) {
        int result = 0;
        int DEFAULT = 21;
        
        int all = n/7;
        for(int i = 1 ; i <= all ; i++) {
            result += DEFAULT+(i*7);
        }
        
        for(int i = 1 ; i <= n%7 ; i++) {
            result += i+all;
        }
        
        return result;
    }
}