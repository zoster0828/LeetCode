class Solution {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int odd[] = new int[2];
        int even[] = new int[2];
        
                
        for(int i = 0 ; i < chars.length ; i++) {
            if(i % 2 == 0) {
                if(chars[i] == '1') {
                    odd[1]++;                    
                } else {
                    even[1]++;
                }
            } else {
                if(chars[i] == '0') {
                    odd[0]++;                    
                } else {
                    even[0]++;
                }
            }
        }
        
        int max = Math.max((odd[0]+odd[1]), (even[0]+even[1]));
        
        return chars.length - max;
    }
}