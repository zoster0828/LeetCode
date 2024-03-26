class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] n = new int[nums.length+2];
        
        int pos = 1;
        
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < pos || nums[i] > nums.length) {
                continue;
            }
            
            n[nums[i]] = 1;
            
            if(nums[i] == pos) {
                while(n[pos] != 0) {
                    pos++;
                }
            }
        }
        
        return pos;
    }
}