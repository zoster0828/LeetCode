class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int) Math.pow(2, maximumBit) - 1;
        int n = nums.length;

        int[] result = new int[n];
        int position = 0;
        int full = nums[0];

        for(int i = 1; i < n ; i++) {
            full ^= nums[i];
        }

        int po = 0;
        for(int i = n-1 ; i >= 0 ; i--) {
            if(full == max) result[po] = 0;
            else result[po] = full ^ max;
            po++;
            full  ^= nums[i];
        }

        return result;
    }
}