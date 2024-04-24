class Solution {
    int[] memo;
    public int fib(int n) {
        memo = new int[n+1];
        return calc(n);
    }
    
    public int calc(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        
        if(memo[n] != 0) return memo[n];
        
        memo[n] = calc(n-2) + calc(n-1);
        return memo[n];
    }
}