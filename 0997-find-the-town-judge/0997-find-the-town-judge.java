class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] t = new int[n+1];
        
        for(int i = 0 ; i < trust.length ; i++) {
            t[trust[i][0]]--;
            if(t[trust[i][1]] < 0) continue;
            t[trust[i][1]]++;
            
        }
        
        for(int i = 1 ; i < n+1 ; i++) {
            if(t[i] == n-1) {
                return i;
            }
        }
        
        return -1;
    }
}