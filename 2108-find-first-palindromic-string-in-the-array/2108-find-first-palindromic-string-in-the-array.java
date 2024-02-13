class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words) {
            if(isPalindromic(word.toCharArray())) {
                return word;
            }
        }

        return "";
    }

    boolean isPalindromic(char[] word) {
        for(int i = 0 ; i < word.length / 2 ; i ++) {
            if (word[i] != word[word.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}