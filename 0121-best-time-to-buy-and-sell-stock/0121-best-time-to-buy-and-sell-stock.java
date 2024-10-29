class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int prev = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++) {
            if(prices[i] < prev) {
                prev = prices[i];
                continue;
            } else {
                max = Math.max(max, prices[i] - prev);
            }
        }

        return max;
    }
}