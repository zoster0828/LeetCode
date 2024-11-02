class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] chars = sentence.toCharArray();
        int n = chars.length;
        char c = chars[0];
        if(c != chars[n-1]) return false;
        
        boolean check = false;
        for(int i = 0 ; i < n ; i++) {
            if(check) {
                if(c == chars[i]) {check = false; continue;}
                else return false;
            }

            if(chars[i] == ' ') {
                check = true;
            } else {
                c = chars[i];
            }            
        }

        return true;
    }
}