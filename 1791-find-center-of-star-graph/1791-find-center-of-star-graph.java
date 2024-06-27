class Solution {
    public int findCenter(int[][] edges) {
        int size = edges.length;
        int counts[] = new int[size+2];
        for(int i = 0 ; i < size ; i++) {
            counts[edges[i][0]]++;
            counts[edges[i][1]]++;

            if(i == size -1) {
                if(counts[edges[i][0]] == size) {
                    return edges[i][0];
                }

                if(counts[edges[i][1]] == size) {
                    return edges[i][1];
                }
            }
        }

        return -1;
    }
}