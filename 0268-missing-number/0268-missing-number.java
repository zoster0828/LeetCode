class Solution {
    public int missingNumber(int[] nums) {
        int haveto = (nums.length) * (nums.length+1) / 2;

        int sum = 0;
        for(int num : nums) {
            if(num > nums.length) {continue;}
            sum += num;
        }

        return haveto - sum;
    }
}