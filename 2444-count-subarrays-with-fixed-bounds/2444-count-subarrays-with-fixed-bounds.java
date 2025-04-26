class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int min = -1;
        int max = -1;
        int no = -1;
        long result = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] < minK || nums[i] > maxK) no = i;
            if(nums[i] == minK) min = i;
            if(nums[i] == maxK) max = i;

            result += Math.max(0L, Math.min(max, min) - no);
        }

        return result;
    }
}