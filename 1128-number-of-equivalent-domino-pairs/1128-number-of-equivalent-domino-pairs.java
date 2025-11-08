class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {        
        int result = 0;
        int n = dominoes.length;
        int arr[] = new int[100];
        for(int i = 0 ; i < n ; i++) {
            int a = dominoes[i][0]*10 + dominoes[i][1];
            int b = dominoes[i][1]*10 + dominoes[i][0];
            arr[Math.max(a,b)]++;
        }

        for(int i = 0 ; i < 100 ; i++) {
            result += arr[i] * (arr[i] -1) /2;            
        }

        return result;
    }
}