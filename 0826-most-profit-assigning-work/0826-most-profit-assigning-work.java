class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max = 0;
        for(int i = 0 ; i < worker.length ; i++) {
            max = Math.max(max, worker[i]);
        }

        int[] array = new int[max+1];

        for(int i = 0 ; i < difficulty.length ; i++) {
            int po = difficulty[i];
            while(po <= max && array[po] < profit[i]) {
                array[po] = profit[i];
                po++;
            }
        }

        int result = 0;
        for(int i = 0 ; i < worker.length ; i++) {
            result += array[worker[i]];
        }

        return result;
    }
}