class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        for(; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(ch == c) {
                break;
            }
        }
        
        if(i == word.length()) return word;
        
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