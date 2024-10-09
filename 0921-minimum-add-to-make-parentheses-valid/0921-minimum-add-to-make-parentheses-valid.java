class Solution {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        int balance = 0;
        int result = 0;
        for(int i = 0 ; i < n ; i++) {
            if(chars[i] == '(') {
                balance ++;
            } else {
                if(balance > 0) balance--;
                else result++;                
            }
        }

        return balance + result;
    }
}