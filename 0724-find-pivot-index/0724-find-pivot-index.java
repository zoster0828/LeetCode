class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1 ; i < n ; i++) {
            rightSum += nums[i];
        }
        if(leftSum == rightSum) return 0;
        
        for(int pivot = 1 ; pivot < n ; pivot++) {
            leftSum += nums[pivot-1];                
            rightSum -= nums[pivot];
            if(leftSum == rightSum) return pivot;            
        }

        return -1;
    }
}