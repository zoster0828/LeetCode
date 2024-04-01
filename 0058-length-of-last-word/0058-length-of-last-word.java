class Solution {
    public int lengthOfLastWord(String s) {

        int continuous = 0;
        for(int i = s.length() - 1; i >= 0 ; i--) {
            if(s.charAt(i) != ' ') continuous++;
            else if(continuous != 0) break;
        }
        
        return continuous;
    }
}