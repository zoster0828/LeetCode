class Solution {
    public String reversePrefix(String word, char ch) {
        int position = word.indexOf(ch);
        if(-1 == position) return word;
        
        return new StringBuilder().append(word.substring(0, position+1))
            .reverse()
            .append(word.substring(position+1, word.length()))
            .toString();
    }
}