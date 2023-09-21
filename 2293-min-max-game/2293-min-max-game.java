class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        
        boolean odd = true;
        int[] temp = new int[nums.length / 2];
        for(int i = 0 ; i < nums.length ; i+=2) {                                
            temp[i/2] = odd ? Math.min(nums[i], nums[i+1]) : Math.max(nums[i], nums[i+1]);                
            odd = true ^ odd;
        }
        return minMaxGame(temp);
    }
}