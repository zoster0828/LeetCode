class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;
        int zero = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < s.length(); i ++){
            if(s.charAt(i) == '1') {                
                if(one == 1) {
                    builder.append('1');
                }
                else{
                    one++;
                }
            } else {
                zero++;
            }
        }
        
        while(zero > 0) {
            builder.append('0');
            zero--;
        }
        
        builder.append('1');
        
        return builder.toString();
    }
}