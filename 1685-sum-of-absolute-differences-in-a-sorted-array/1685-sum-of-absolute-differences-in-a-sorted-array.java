class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int result[] = new int[nums.length];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        
        int curr = sum;
        for(int i = nums.length -1 ; i >= 0 ; i--) {
            curr -= nums[i];
            result[i] += (i * nums[i]) - curr;
            result[i] += (sum-curr-nums[i]) - ((nums.length - i - 1) * nums[i]);
        }
        
        return result;
    }
}