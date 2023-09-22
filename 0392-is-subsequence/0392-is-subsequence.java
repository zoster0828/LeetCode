class Solution {
    public boolean isSubsequence(String s, String t) {        
        int j = 0;
        int slen = s.length();
        
        for(int i = 0 ; i < t.length() ; i++) {            
            if(j == slen) {
                   return true;
            }
            
            if(t.charAt(i) == s.charAt(j)) {
                j++;                
            }
        }
        
        if(j == slen) {
            return true;
        } else {
            return false;
        }
    }
}