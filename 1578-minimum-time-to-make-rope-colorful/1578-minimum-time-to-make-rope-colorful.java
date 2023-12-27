class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] color = colors.toCharArray();
        
        char prev = '.';
        int prevPosition = -1;
        int result = 0;
        
        for(int i = 0 ; i < color.length ; i++) {
            if(color[i] == prev) {
                if(neededTime[i] > neededTime[prevPosition]) {
                    result += neededTime[prevPosition];
                    prev = color[i];
                    prevPosition = i;
                } else {
                    result += neededTime[i];
                }
            } else {
                prev = color[i];
                prevPosition = i;
            }
        }
        
        return result;
    }
}