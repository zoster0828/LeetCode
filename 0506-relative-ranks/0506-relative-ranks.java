class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[][] pairs = new int[score.length][2];
        
        for(int i = 0 ; i < score.length ; i++) pairs[i] = new int[]{score[i],i};
        
        Arrays.sort(pairs, (x,y) -> y[0] - x[0]);
        
        String[] result = new String[score.length];
        for(int i = 0 ; i < score.length ; i++) {
            if(i == 0) result[pairs[i][1]] = "Gold Medal";
            else if(i == 1) result[pairs[i][1]] = "Silver Medal";
            else if(i == 2) result[pairs[i][1]] = "Bronze Medal";
            else result[pairs[i][1]] = ""+(i+1);
        }
        
        return result;
    }
}