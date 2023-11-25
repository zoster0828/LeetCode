class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        // Calculate prefix sums
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Calculate suffix sums
        suffixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        // Calculate the result in one pass
        for (int i = 0; i < n; i++) {
            int leftSum = i > 0 ? prefixSum[i - 1] : 0;
            int rightSum = suffixSum[i] - nums[i];

            result[i] = nums[i] * i - leftSum + rightSum - nums[i] * (n - i - 1);
        }

        return result;
    }
}