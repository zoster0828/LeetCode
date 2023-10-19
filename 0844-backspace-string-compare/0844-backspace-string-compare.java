class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        
        chars1 = replace(chars1);
        chars2 = replace(chars2);
        
        String newS = charToString(chars1);
        String newT = charToString(chars2);
        
        return newS.equals(newT);
    }
    
    public String charToString(char[] chars) {
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] != '\u0000')
                strBuilder.append(chars[i]);
        }
        return strBuilder.toString();
    }
    
    public char[] replace(char[] chars) {
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == '#') {
                chars[i] = '\u0000';
                for(;i >= 0 ; i--) {
                    if(chars[i] != '\u0000') {
                        chars[i] = '\u0000';
                        break;
                    }
                }
            }
        }
        
        return chars;
    }
}