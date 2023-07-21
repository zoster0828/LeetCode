class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[][] result = new int[names.length][2];
        for(int i = 0 ; i < names.length ; i ++) {
            result[i][0] = i;
            result[i][1] = heights[i];
        }
        
        Arrays.sort(result, Comparator.comparingInt(arr -> -arr[1]));        
        
        String[] ans = new String[names.length];
        for(int i = 0 ; i < names.length ; i ++) {
            ans[i] = names[result[i][0]];
        }
        
        return ans;
    }
}