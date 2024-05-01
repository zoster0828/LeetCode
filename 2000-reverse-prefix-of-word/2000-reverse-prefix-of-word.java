class Solution {
    public String reversePrefix(String word, char ch) {
        if(-1 == word.indexOf(ch)) return word;
        
        int i = 0;
        for(; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(ch == c) {
                break;
            }
        }        
        
        
        int po = i+1;
        StringBuilder builder = new StringBuilder();
        for(;i>=0;i--) {
            builder.append(word.charAt(i));
        }
        for(;po < word.length() ; po++) {
            builder.append(word.charAt(po));
        }
        
        return builder.toString();
    }
}