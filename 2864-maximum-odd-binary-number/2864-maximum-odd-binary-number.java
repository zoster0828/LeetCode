class Solution {
    public String maximumOddBinaryNumber(String s) {
        boolean hasOne = false;
        int zero = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < s.length(); i ++){
            if(s.charAt(i) == '1') {                
                if(hasOne) {
                    builder.append('1');
                }
                else{
                    hasOne = true;
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