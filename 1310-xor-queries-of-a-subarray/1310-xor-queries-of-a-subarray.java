class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        Map<String, Integer> map = new HashMap();
        int n = queries.length;
        int[] result = new int[n];

        for(int i = 0 ; i < n ; i++) {
            if(queries[i][0] == queries[i][1]) {
                result[i] = arr[queries[i][0]];
            } else {
                String key = queries[i][0] +""+ queries[i][1];
                if(map.containsKey(key)) {
                    result[i] = map.get(key);
                } else {
                    for(int j = queries[i][0] ; j <= queries[i][1] ; j++) {
                        result[i] ^= arr[j];
                    }
                    map.put(key, result[i]);                    
                }
            }
        }        

        return result;
    }
}