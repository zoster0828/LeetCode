class Solution {
    public int minPairSum(int[] nums) {        
        
        int max = Integer.MIN_VALUE;
        for(int num : nums) {            
            max = Math.max(max, num);
        }
        
        int[] number = new int[max+1];
        for(int num : nums) {            
            number[num]++;
        }
        
        int result = Integer.MIN_VALUE;
        
        int min = 1;
        while(min <= max) {
            if(number[min] == 0) {min++;continue;}
            if(number[max] == 0) {max--;continue;}
            
            result = Math.max(min + max, result);
            number[min]--;
            number[max]--;
        }
        
        return result;
    }
}