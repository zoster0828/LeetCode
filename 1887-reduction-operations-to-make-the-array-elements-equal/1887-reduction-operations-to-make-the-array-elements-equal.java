class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        
        int prev = nums[0];
        int height = 0;
        int result = 0 ;
        for(int i = 1 ; i < nums.length ; i++) {
            int curr = 0;
            if(prev != nums[i]) {
                curr = height+1;
                prev = nums[i];
            } else {
                curr = height;
            }
            
            result += curr;
            height = curr;
        }
        
        return result;
    }
}