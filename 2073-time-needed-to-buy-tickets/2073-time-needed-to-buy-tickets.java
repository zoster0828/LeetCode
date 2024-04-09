class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = tickets.length;
        
        int len = tickets.length;
        
        int result = 0;
        while(tickets[k] > 0) {
            for(int i = 0 ; i < len ; i++) {
                if(tickets[i] > 0) {
                    tickets[i]--;
                    result++;
                }
                
                if(tickets[k] == 0) {
                    break;
                }
            }
        }
        
        return result;
    }
}