class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        
        int prev = nums[0];
        int[] heights = new int[nums.length];
        int result = 0 ;
        for(int i = 1 ; i < nums.length ; i++) {
            if(prev != nums[i]) {
                heights[i] = heights[i-1]+1;
                prev = nums[i];
            } else {
                heights[i] = heights[i-1];
            }
            
            result += heights[i];
        }
        
        return result;
    }
}