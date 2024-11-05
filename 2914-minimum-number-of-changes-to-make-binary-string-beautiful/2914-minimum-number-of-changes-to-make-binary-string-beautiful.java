class Solution {
    public int minChanges(String s) {
        int n = s.length();

        int result = 0;
        for(int i = 0 ; i < n  ; i+=2) {
            int num1 = s.charAt(i) - '0';            
            int num2 = s.charAt(i+1) - '0';            
            if(num1 != num2) result++;
        }

        return result;
    }
}