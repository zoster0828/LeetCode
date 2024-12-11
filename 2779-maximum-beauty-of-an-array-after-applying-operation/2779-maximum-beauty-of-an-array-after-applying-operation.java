class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);

        int count  = 0;
        for(int i = 0, j = 0; i < nums.length ; i++) {
            int max = 0;
            for(; j < nums.length && nums[j] - nums[i] <= k * 2 ; j++) {
            }
            count = Math.max(count, j - i);
        }

        return count;
    }
}