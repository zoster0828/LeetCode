class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;

        int result = 0;
        for(int i = 0 ; i < n-2 ; i ++) {
            if(nums[i+1] != 0 && nums[i+1]/2 == 0) continue;
            if(nums[i+1] % 2 != 0) continue;
            if(nums[i] + nums[i+2] == nums[i+1]/2) {
                result ++;
            }
        }

        return result;
    }
}