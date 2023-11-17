class Solution {
    public int minPairSum(int[] nums) {
        int[] number = new int[100001];
        
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            number[num]++;
            max = Math.max(max, num);
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