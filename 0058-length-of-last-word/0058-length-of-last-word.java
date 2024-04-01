class Solution {
    public int lengthOfLastWord(String s) {
        int continuous = 0;
        int temp = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == ' ') {                
                continuous = temp == 0 ? continuous : temp;
                temp = 0;
            } else {
                temp++;
            }
        }
        
        return temp == 0 ? continuous : temp;
    }
}