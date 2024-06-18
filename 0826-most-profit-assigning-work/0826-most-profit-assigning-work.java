class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int max = 0;
        for(int i = 0 ; i < difficulty.length ; i++) {
            max = Math.max(max, difficulty[i]);
        }

        int[] bestProfit = new int[max + 1];
        for (int i = 0; i < profit.length; i++) {
            bestProfit[difficulty[i]] = Math.max(bestProfit[difficulty[i]], profit[i]);
        }

        int maxProfit = 0;
        for (int i = 0; i < bestProfit.length; i++) {
            if (bestProfit[i] > maxProfit) {
                maxProfit = bestProfit[i];
            }
            bestProfit[i] = maxProfit;
        }

        int result = 0;
        for(int i = 0 ; i < worker.length ; i++) {
            if(worker[i] >= bestProfit.length) result += bestProfit[max];
            else result += bestProfit[worker[i]];
        }

        return result;
    }
}