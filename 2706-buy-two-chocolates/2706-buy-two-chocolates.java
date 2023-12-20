class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE-1;
        int min2 = Integer.MAX_VALUE;
        
        for(int num : prices) {
            if(num < min2) {
                min2 = num;
                if(min2 < min1) {
                    int temp = min1;
                    min1 = min2;
                    min2 = temp;
                }
            }
        }
        
        int result = money - (min1+min2);
        
        return result < 0 ? money : result;
    }
}