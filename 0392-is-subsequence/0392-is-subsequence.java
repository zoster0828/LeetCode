class Solution {
    public boolean isSubsequence(String s, String t) {        
        int j = 0;
        
        for(int i = 0 ; i < t.length() ; i++) {            
            if(j == s.length()) {
                   return true;
            }
            
            if(t.charAt(i) == s.charAt(j)) {
                j++;                
            }
        }
        
        if(j == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}