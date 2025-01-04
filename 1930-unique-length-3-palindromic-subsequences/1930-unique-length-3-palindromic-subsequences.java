class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int pairs[][] = new int[26][2];
        for(int i = 0 ; i < 26 ; i ++) {
            pairs[i][0] = n+1;
            pairs[i][1] = -1;
        }
        
        for(int i = 0 ; i < n ; i++) {
            char c = s.charAt(i);
            pairs[c-'a'][0] = Math.min(pairs[c-'a'][0], i);
            pairs[c-'a'][1] = Math.max(pairs[c-'a'][1], i);
        }

        int sum = 0;
        for(int i = 0 ; i < 26 ; i++) {
            int[] po = pairs[i];
            if(po[0] < n && po[1] > -1) {
                sum += calculate(s, po[0], po[1]);
            }
        }

        return sum;
    }

    private int calculate(String s, int start, int end) {
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;
        for (int i = start + 1; i < end; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    uniqueCount++;
                }
            }
        }

        return uniqueCount;
    }
}