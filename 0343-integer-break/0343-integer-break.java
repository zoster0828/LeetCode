class Solution {
    public int integerBreak(int n) {
        int max = Integer.MIN_VALUE;

        for(int i = 2 ; i <= n ; i++) {
            int v = n/i;
            int remain = n%i;

            int result = 1;
            for(int j = 0 ; j < i ; j++) {
                result = result * (v+(remain-- > 0 ? 1 : 0));
            }
            if(max < result) {
                max = result;
            }
        }

        return max;
    }
}