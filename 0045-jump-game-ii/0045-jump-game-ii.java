class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        int result = 0;
        int max = 0;
        int currEnd = 0;
        for(int i = 0 ; i < n - 1 ; i++) {
            max = Math.max(i+nums[i], max);
            if(i == currEnd) {
                result++;
                currEnd = max;
            }
        }
        return result;
    }
}