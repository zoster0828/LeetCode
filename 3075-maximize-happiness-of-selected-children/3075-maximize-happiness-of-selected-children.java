class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        int n = happiness.length - 1;
        long result = 0;
        for(int i = 0 ; i < k ; i++) {
            int candidate = happiness[n-i]-i;
            if(candidate < 0) candidate = 0;
            result += candidate;
        }
        
        return result;
    }
}