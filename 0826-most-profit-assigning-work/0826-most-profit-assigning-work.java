class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        DifficultyProfit[] difficultyProfits = new DifficultyProfit[difficulty.length];

        for(int i = 0 ; i < difficultyProfits.length ; i++) {
            difficultyProfits[i] = new DifficultyProfit(difficulty[i], profit[i]);
        }

        Arrays.sort(difficultyProfits, Comparator.comparingInt(x -> x.difficulty));

        int[] cache = new int[100001];

        int result = 0;
        for(int w : worker) {
            if(cache[w] != 0) {
                result += cache[w];
                continue;
            }

            for(int i = 0 ; i < difficultyProfits.length ; i ++) {
                if(difficultyProfits[i].difficulty <= w && cache[w] < difficultyProfits[i].profit) {
                    cache[w] = profit[i];
                }

                if(difficultyProfits[i].difficulty > w) break;
            }

            result += cache[w];
        }

        return result;
    }

    class DifficultyProfit{
        public int difficulty;
        public int profit;
        public DifficultyProfit(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }
}