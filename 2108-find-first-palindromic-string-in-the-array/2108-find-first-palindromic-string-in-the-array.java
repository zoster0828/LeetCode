class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words) {
            if(isPalindromic(word)) {
                return word;
            }
        }

        return "";
    }

    boolean isPalindromic(String word) {
        int len = word.length();
        for(int i = 0 ; i < len / 2 ; i ++) {
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}