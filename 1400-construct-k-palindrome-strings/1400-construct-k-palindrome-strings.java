class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        int[] chars = new int[26];

        for(char c : s.toCharArray()) {
            chars[c-'a'] ++;
        }

        int result = 0;
        for(int i = 0 ; i < 26 ;i++) {
            if(chars[i] % 2 == 1) result++;
        }

        if(k < result) return false;
        
        return true;
    }
}