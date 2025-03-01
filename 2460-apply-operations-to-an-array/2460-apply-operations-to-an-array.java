class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int resultPo = 0;
        for(int i = 0 ; i < n ; i++) {
            if(i < n-1 && nums[i] == nums[i+1]) {
                nums[i] = nums[i]*2;                
                nums[i+1] = 0;
            }
            if(nums[i] != 0) {
                result[resultPo++] = nums[i];
            }
        }

        for( ; resultPo < n ; resultPo++) {
            result[resultPo] = 0;
        }

        return result;
    }
}