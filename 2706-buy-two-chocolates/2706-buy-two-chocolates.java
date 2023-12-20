class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        
        int result = money - (prices[0] + prices[1]);
        
        return result < 0 ? money : result;
    }
}