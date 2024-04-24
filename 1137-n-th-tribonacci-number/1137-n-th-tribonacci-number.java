class Solution {
    Map<Integer, Integer> memo = new HashMap();
    public int tribonacci(int n) {
        return T(n);
    }
    
    public int T(int n) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        int result = T(n-3) + T(n-2) + T(n-1);
        memo.put(n, result);
        return result;
    }
}