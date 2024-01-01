class Solution {
    public boolean isPalindrome(String s) {     
        s = s.toLowerCase();
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        while(start <= end) {
            if(isNotValid(chars[start])) {
                start++;
                continue;
            }
            
            if(isNotValid(chars[end])) {
                end--;
                continue;
            }
            
            if(chars[start] != chars[end]) {
                return false;
                
            } 
            
            start ++;
            end --;
        }

        return true;
    }
    
    boolean isNotValid(char c) {
        int l = c;

        if(l>64 && l<91) l+=32;

        if(!((l > 96 && l < 123)|| (l > 47 && l < 58))) {return true;}
        
        return false;
    }
}