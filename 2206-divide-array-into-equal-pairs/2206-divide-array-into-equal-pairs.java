class Solution {
    public boolean divideArray(int[] nums) {
        int a = 0;
        for(int num : nums) {
            a ^= num;
        }

        return a==0;
    }
}