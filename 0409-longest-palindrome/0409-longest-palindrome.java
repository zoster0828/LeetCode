class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[58];
        int n = s.length();
        for(int i = 0 ; i < n ; i++) {
            int n = s.charAt(i) - 65;
            chars[n] ++;
        }

        int result = 0;
        int odd = 0;
        for(int i = 0 ; i < chars.length ; i ++) {
            if(chars[i] % 2 ==0) result+=chars[i];
            else {
                result+=(chars[i] - 1);
                odd = 1;
            }
        }

        return result + odd;
    }
}