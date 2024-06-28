class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long counts[] = new long[n+1];
        
        for(int[] road : roads) {
            counts[road[0]]++;
            counts[road[1]]++;
        }

        Arrays.sort(counts);

        long result = 0;
        for(int i = 1 ; i < counts.length ; i++) {
            result += (counts[i] * (i));
        }

        return result;
    }
}