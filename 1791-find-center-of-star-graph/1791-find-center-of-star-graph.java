class Solution {
    public int findCenter(int[][] edges) {
        int size = edges.length;
        int counts[] = new int[size+2];
        for(int i = 0 ; i < size ; i++) {
            counts[edges[i][0]]++;
            counts[edges[i][1]]++;
        }

        return counts[edges[0][0]] > counts[edges[0][1]] ? edges[0][0] : edges[0][1];
    }
}