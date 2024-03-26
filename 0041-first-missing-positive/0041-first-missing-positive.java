class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] n = new int[100002];
        
        int pos = 1;
        
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] < 1 || nums[i] > 100000) {
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