class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[70];
        for(int i = 0 ; i < s.length() ; i++) {
            int n = s.charAt(i) - 65;

            chars[n] ++;
        }

        int result = 0;
        boolean odd = false;
        for(int i = 0 ; i < chars.length ; i ++) {
            if(chars[i] % 2 ==0) result+=chars[i];
            else {
                result+=(chars[i] - 1);
                odd = true;
            }
        }

        return odd ? result + 1 : result;
    }
}