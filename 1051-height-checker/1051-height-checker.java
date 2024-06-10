class Solution {
    public int heightChecker(int[] heights) {
        int[] copied = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copied);

        int result = 0;
        for(int i = 0 ; i < heights.length; i++) {
            if(heights[i] != copied[i]) result++;
        }

        return result;
    }
}