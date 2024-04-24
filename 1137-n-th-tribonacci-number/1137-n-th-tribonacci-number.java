class Solution {
    int[] memo = new int[100];
    public int tribonacci(int n) {
        return T(n);
    }
    
    public int T(int n) {
        if(memo[n] != 0) {
            return memo[n];
        }
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        int result = T(n-3) + T(n-2) + T(n-1);
        memo[n] = result;
        return result;
    }
}