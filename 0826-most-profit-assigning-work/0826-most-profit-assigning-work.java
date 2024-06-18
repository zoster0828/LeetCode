class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int[] cache = new int[100001];

        int result = 0;
        for(int w : worker) {
            if(cache[w] != 0) {
                result += cache[w];
                continue;
            }

            for(int i = 0 ; i < difficulty.length ; i ++) {
                if(difficulty[i] <= w && cache[w] < profit[i]) {
                    cache[w] = profit[i];                    
                }
            }

            result += cache[w];
        }

        return result;
    }
}