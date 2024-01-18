class Solution {
    public int climbStairs(int n) {
        int[] result = new int[45];
        
        result[0] = 1;
        result[1] = 2;
        
        for(int i = 2 ; i < n ; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        
        return result[n-1];
    }
}