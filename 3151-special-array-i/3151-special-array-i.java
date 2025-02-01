class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean rev = nums[0] % 2 == 0;
        int n = nums.length;
        for(int i = 1 ; i < n ;i++) {
            if((nums[i] %2 == 0) == rev) return false;

            rev = nums[i] %2 == 0;
        }

        return true;
    }
}