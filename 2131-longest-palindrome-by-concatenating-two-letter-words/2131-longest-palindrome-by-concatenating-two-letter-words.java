class Solution {
    public int longestPalindrome(String[] words) {
        int[][] wordCount = new int[26][26];
        for(String word : words) {
            char c1 = word.charAt(0);
            char c2 = word.charAt(1);
            wordCount[c1-'a'][c2-'a']++;
        }

        int result = 0;        
        boolean a = true;
        for(int i = 0 ; i < 26 ; i++) {
            for(int j = 0 ; j < 26 ; j++) {
                if(i==j) {
                    if(wordCount[i][i] > 1) {
                        if(wordCount[i][i] % 2 == 0) {
                            result += wordCount[i][i];
                        } else {
                            result += wordCount[i][i] -1;              
                        }
                    }

                    if(wordCount[i][i] % 2 != 0 && a) {
                        result += 1;
                        a = false;
                    }
                } else {
                    result += Math.min(wordCount[i][j], wordCount[j][i]);
                }                
            }
        }


        return result * 2;
    }
}