class Solution {
    public int longestWPI(int[] hours) {
        int max = 0;
        for(int i = 0 ; i < hours.length ; i++) {            
            int continuous = 0;
            for(int  j = i ; j < hours.length ; j++ ) {
                if(hours[j] > 8) {
                    continuous ++;
                } else {
                    continuous --;
                }
                
                if(continuous == 1) {
                    max = Math.max(j-i+1, max);
                }
            }
            
            if(continuous > 0) {
                max = Math.max(hours.length-i, max);
            }
        }
        
        return max;
    }
}