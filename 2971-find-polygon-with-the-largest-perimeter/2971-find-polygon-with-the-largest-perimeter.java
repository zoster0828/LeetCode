class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        long sum[] = new long[nums.length];
        boolean possible = false;
        sum[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i ++) {
            sum[i] = sum[i-1] + nums[i];
        }
        
        long result = Integer.MIN_VALUE;
        for(int i = 2 ; i < nums.length ; i++) {
            if(sum[i] < sum[i-1] * 2) {
                result = Math.max(result, sum[i]);
            }
        }
        
        return result == Integer.MIN_VALUE ? -1 : result;
    }
}