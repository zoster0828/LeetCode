class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];

        for(int i = 0 ; i < n ; i++) {
            if(queries[i][0] == queries[i][1]) {
                result[i] = arr[queries[i][0]];
            } else {
                for(int j = queries[i][0] ; j <= queries[i][1] ; j++)
                    result[i] ^= arr[j];
            }
        }        

        return result;
    }
}