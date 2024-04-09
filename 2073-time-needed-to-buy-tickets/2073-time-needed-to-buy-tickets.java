class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int result = 0;
        int me = tickets[k];
        
        
        for(int i = 0 ; i < tickets.length ; i++) {
            if(tickets[i] < me) {
                result += tickets[i];
            } else { 
            
                if(i <= k){
                    result += me;
                } else {
                    result += (me-1);
                }
            }
        }
        
        return result;
    }
}