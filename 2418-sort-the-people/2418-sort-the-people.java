class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sorted = new String[100001];

        for(int i = 0 ; i < n ; i++) {
            sorted[heights[i]] = names[i];
        }


        String result[] = new String[n];
        int i = 0;
        for(int j = sorted.length -1 ; j >= 0 && i < n ; j--) {
            if(sorted[j] != null) {
                result[i] = sorted[j];
                i++;
            }
        }

        return result;
    }
}