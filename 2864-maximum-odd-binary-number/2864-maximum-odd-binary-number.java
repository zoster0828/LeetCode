class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;
        int zero = 0;
        for(int i = 0 ; i < s.length(); i ++){
            if(s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }
        }
        
        StringBuilder builder = new StringBuilder();
        
        while(one >= 2) {
            builder.append('1');
            one--;
        }
        
        while(zero > 0) {
            builder.append('0');
            zero--;
        }
        
        builder.append('1');
        
        return builder.toString();
    }
}