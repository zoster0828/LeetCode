class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = allowed.length();
        boolean[] exists = new boolean[26];
        for(int i = 0 ; i < n ; i++) {
            exists[allowed.charAt(i)-'a'] = true;
        }

        int result = 0;
        for(String s : words) {
            int len = s.length();
            for(int i = 0 ; i < len ; i++) {
                if(!exists[s.charAt(i)-'a']) {
                    break;
                }

                if(i+1 == len) result++;
            }
        }

        return result;
    }
}