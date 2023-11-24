class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int result = 0;
        int i = piles.length-2;
        int count = 0;
        while(count < piles.length / 3) {
            result += piles[i];
            i -= 2;
            count++;
        }
        
        return result;
    }
}