class Solution {
    public int findMaxK(int[] nums) {
        boolean[] candidates = new boolean[2001];
        
        int max = -1 ;
        for(int i = 0 ; i < nums.length ; i++) {
            int absolute = Math.abs(nums[i]);            
            candidates[nums[i] < 0 ? absolute+1000 : absolute] = true;            
            
            if(absolute > max && candidates[absolute] && candidates[absolute+1000]) {
                max = Math.max(absolute, max);
            }
        }
                               
        return max;
    }
}