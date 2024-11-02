class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        

        for(int pivot = 0 ; pivot < n ; pivot++) {
            int leftSum = 0;
            int rightSum = 0;
            for(int i = 0 ; i < n ; i++) {
                if(i < pivot)
                    leftSum += nums[i];
                if(i > pivot)
                    rightSum += nums[i];
            }

            if(leftSum == rightSum) return pivot;
        }

        return -1;
    }
}