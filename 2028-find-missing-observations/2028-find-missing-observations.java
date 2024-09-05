class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int len = rolls.length;
        int divider = len+n;

        int sum = 0;
        for(int i : rolls) {
            sum += i;
        }

        int diff = (divider * mean) - sum;
                
        int[] result = new int[n];
        for(int i = 0 ; i < n ; i++) {
            int candid = diff / (n-i);
            if(candid < 1 || candid > 6) {
                return new int[0];
            }
            result[i] = candid;
            diff -= result[i];
        }

        return result;        
    }
}