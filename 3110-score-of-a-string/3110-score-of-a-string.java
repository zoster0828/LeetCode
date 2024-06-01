class Solution {
    public int scoreOfString(String s) {
        int result = 0;
        
        int prev = s.charAt(0);
        for(int i = 1 ; i < s.length() ; i++) {
            int curr = s.charAt(i);
            
            result += Math.abs(prev-curr);
            prev = curr;
        }
        
        return result;
    }
}