class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        if(word1.equals(word2)) return true;
        
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        for(char c : word1.toCharArray()) {
            char1[c-'a']++;
        }
        
        
        for(char c : word2.toCharArray()) {
            if(char1[c-'a'] == 0) return false;
            char2[c-'a']++;
        }
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        for(int i = 0 ; i < 26 ; i++) {
            if(char1[i] != char2[i]){
                return false;
            }
        }
        
        
        return true;
        
    }
}