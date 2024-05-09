class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        int n = happiness.length - 1;
        long result = 0;
        for(int i = 0 ; i < k ; i++) {
            int candidate = Math.max(happiness[n-i]-i, 0);
            result += candidate;
        }
        
        return result;
    }
}