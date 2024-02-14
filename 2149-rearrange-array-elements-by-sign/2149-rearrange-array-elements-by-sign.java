class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] result = new int[nums.length];
        
        
        for(int i=0,p=0,n=1 ; i < nums.length ; i ++) {
            if(nums[i] > 0) {
                result[p] = nums[i];
                p+=2;
            }
            
            if(nums[i] < 0) {
                result[n] = nums[i];
                n+=2;
            }
        }
        
        
        return result;
    }
}