class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int totalSubarrays = nums.length * (nums.length + 1) / 2;
        int[] subarraySums = new int[totalSubarrays];
        int index = 0;

        for (int start = 0; start < nums.length; start++) {
            int currentSum = 0;
            for (int end = start; end < nums.length; end++) {
                currentSum = (currentSum + nums[end]) % 1000000007 ;
                subarraySums[index++] = currentSum ;
            }
        }
        Arrays.sort(subarraySums);

        int result = 0 ;
        for(int i = left-1 ; i < right ; i++) {
            result = (result + subarraySums[i]) % 1000000007;
        }
        return result;
    }
}