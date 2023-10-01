class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        
        StringBuilder strb = new StringBuilder();
        for(int i = 0 ; i <= chars.length ; i++) {
            if(i == chars.length || chars[i] == ' ') {
                for(int k = i-1 ; k >= 0 ; k--) {
                    if(chars[k] == ' ') {
                        break;
                    }
                    strb.append(chars[k]);                    
                }
                strb.append(' ');
            }
        }
        String result = strb.toString();
        return result.substring(0, result.length() -1); 
    }
}