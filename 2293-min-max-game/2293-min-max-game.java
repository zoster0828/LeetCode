class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length != 1) {
            boolean odd = true;
            int[] temp = new int[nums.length / 2];
            for(int i = 0 ; i < nums.length ; i+=2) {                
                if(odd) {
                   temp[i/2] = Math.min(nums[i], nums[i+1]);
                } else {
                    temp[i/2] = Math.max(nums[i], nums[i+1]);
                }
                odd = true ^ odd;
            }
            nums = temp;
        }
        return nums[0];
    }
}