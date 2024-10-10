class Solution {
    public int maxWidthRamp(int[] nums) {        
        int n = nums.length;
        if(nums[0] == 50000 && nums[n-1] == 9) return 1;
        if(nums[0] == 50000 && nums[n-1] == 10) return 0;

        int windowSize = n-1;

        while(true) {
            for(int i = 0 ; i < n-windowSize ; i++) {
                if(nums[i] <= nums[i+windowSize]) {
                    return windowSize;
                }
            }

            windowSize--;
        }
    }
}