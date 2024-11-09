class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;

        int target = n - 1;
        int i = 0;
        int result = 0;
        while(target != 0) {
            if(target <= i+nums[i]) {
                target = i;
                result++;
                i = 0;
                continue;
            }
            i++;
        }

        return result;
    }
}