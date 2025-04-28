class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;

        long result = 0;
        for(int start = 0 ;  start < n ; start++) {
            for(int l = 1 ; l < n - start + 1 ; l++) {
                long temp = 0;
                for(int i = start ; i < start+l ; i++) {
                    temp += nums[i];
                }
                if(temp * l < k) {
                    result++;
                } else {
                    break;
                }
            }

        }

        return result;
    }
}