class Solution {
    public int maximumLength(int[] nums) {
        int c = nums[0] % 2;
        int even = 0, odd = 0, evenOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;  
            } else {
                odd++;  
            }
            if (nums[i] % 2 == c) {
                evenOdd++;   
                c = 1 ^ c;  
            }
        }
        return Math.max(even, Math.max(odd, evenOdd));
    }
}