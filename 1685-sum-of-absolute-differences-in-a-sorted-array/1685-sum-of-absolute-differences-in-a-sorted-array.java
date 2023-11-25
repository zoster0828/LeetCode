class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int result[] = new int[nums.length];
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        
        int curr = sum;
        for(int i = nums.length -1 ; i >= 0 ; i--) {
            int right = sum - curr;
            curr -= nums[i];
            result[i] += (i * nums[i]) - curr;
            result[i] += (right) - ((nums.length - i - 1) * nums[i]);
        }
        
        return result;
    }
}