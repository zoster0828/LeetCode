class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int count[][] = new int[7][2];
        int same[] = new int[7];
        for(int i = 0 ; i < n ; i++) {
            count[tops[i]][0]++;
            count[bottoms[i]][1]++;
            if(tops[i] == bottoms[i]) {
                same[tops[i]]++;
            }
        }

        int min = n+1;
        for(int i = 1 ; i < 7 ; i++) {
            if(count[i][0] + count[i][1] - same[i] >= n) {
                int result = n - Math.max(count[i][0], count[i][1]);
                min = Math.min(result, min);
            }
        }

        return min == n+1 ? -1 : min;
    }
}