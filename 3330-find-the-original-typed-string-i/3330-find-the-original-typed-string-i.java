class Solution {
    public int possibleStringCount(String word) {
        char p = '0';

        int cons = 0;
        int result = 0;
        for(char c : word.toCharArray()) {
            if(c != p) {
                p = c;                
            } else {
                result++;
            }
        }

        return result+1;
    }
}