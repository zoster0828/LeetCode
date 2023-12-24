class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int odd = 0;
        int even = 0;
        
                
        for(int i = 0 ; i < chars.length ; i++) {
            if(i % 2 == 0) {
                if(chars[i] == '1') {
                    odd++;                    
                } else {
                    even++;
                }
            } else {
                if(chars[i] == '0') {
                    odd++;                    
                } else {
                    even++;
                }
            }
        }
        
        int max = Math.max((odd), (even));
        
        return chars.length - max;
    }
}