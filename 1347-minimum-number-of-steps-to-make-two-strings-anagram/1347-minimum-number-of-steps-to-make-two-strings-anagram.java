class Solution {
    public int minSteps(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];
        
        for(char c : s.toCharArray()) {
            sChars[c-'a']++;
        }
        
        for(char c : t.toCharArray()) {
            tChars[c-'a']++;
        }
        
        int result = 0;
        for(int i = 0 ; i < 26 ;i++) {
            result += Math.abs(sChars[i]-tChars[i]);
        }
        
        return result/2;
    }
}