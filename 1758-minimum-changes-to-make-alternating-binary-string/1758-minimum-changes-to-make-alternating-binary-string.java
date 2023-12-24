class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        
        int result = 0;
                
        for(int i = 0 ; i < chars.length ; i++) {
            if(i%2 == 0) {
                if(chars[i] != '0') {
                    result++;
                }
            }else {
                if(chars[i] != '1') {
                    result++;
                }
            }
        }
        
        int result2 = 0;
        for(int i = 0 ; i < chars.length ; i++) {
            if(i%2 == 1) {
                if(chars[i] != '0') {
                    result2++;
                }
            }else {
                if(chars[i] != '1') {
                    result2++;
                }
            }
        }
        
        return Math.min(result, result2);
    }
}