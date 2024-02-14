class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        
        int[] result = new int[nums.length];
        
        
        for(int i=0,p=0,n=0 ; i < nums.length ; i ++) {
            if(nums[i] > 0 ) {
                positive[p] = nums[i];
                p++;
            }
            
            if(nums[i] < 0 ) {
                negative[n] = nums[i];
                n++;
            }
        }
        
        for(int i=0,p=0,n=0 ; i < nums.length ; i ++) {
            if(i%2 == 0) {
                result[i] = positive[p];
                p++;
            }else {
                result[i] = negative[n];
                n++;
            }
        }
        
        return result;
    }
}