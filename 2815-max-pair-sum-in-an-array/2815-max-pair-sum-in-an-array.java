class Solution {
    public int maxSum(int[] nums) {
        int max = -1;
        int[] maxNums = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++) {
            maxNums[i] = getMaxNum(nums[i]);
        }
        
        for(int i = 0 ; i < nums.length - 1 ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {                
                
                if(maxNums[i]==maxNums[j]) {
                    max = Math.max(nums[i]+nums[j], max);
                }
            }
        }
        
        return max;
    }
    
    int getMaxNum(int a) {
        int max = 0;
        while(true) {
            if(max == 9) break;
            max = Math.max(max, a%10);
            
            if(a < 10) {
                break;
            }
            
            a /= 10;
        }
        
        return max;
    }
}