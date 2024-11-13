class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        int n = nums.length;
        long result = 0;
        int right = n-1;           
        for(int i = 0 ; i < n - 1 ; i++) { 
            int left = i+1;
            

            while(left <= right) {                
                if(nums[i] + nums[left] < lower) {
                    left++;
                } else if(nums[i] + nums[right] > upper) {
                    right--;                    
                } else {
                    break;
                }
            }

            if(left <= right) result += (right-left+1);
        }

        return result;
    }
}

// n^2 

// 3 ,6

//0,1,4,4,5,7

//1,2,5,7,9   4 8