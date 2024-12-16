class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int minPo = -1;
        
        for(int i = 0 ; i < k ; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < nums.length ; j++) {
                if(min > nums[j]) {
                    min = nums[j];
                    minPo = j;
                }
            }
            nums[minPo] *= multiplier;            
        }

        return nums;
    }
}