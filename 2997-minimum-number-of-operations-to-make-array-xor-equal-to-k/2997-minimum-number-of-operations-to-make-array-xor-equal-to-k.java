class Solution {
    public int minOperations(int[] nums, int k) {
        int[] count = new int[22];
        
        for(int i = 0 ; i < nums.length ; i++){
            String str = Integer.toBinaryString(nums[i]);
            for(int j = str.length()-1 ; j >= 0 ; j--) {
                if(str.charAt(j) == '1') {
                    count[-(j-str.length()-1)]++;
                }
            }
        }
        
        String str = Integer.toBinaryString(k);
        for(int j = str.length()-1 ; j >= 0 ; j--) {
            if(str.charAt(j) == '1') {
                count[-(j-str.length()-1)]++;
            }
        }
        
        
        int result = 0;
        for(int i : count) {
            if(i % 2 != 0) {
                result++;
            }
        }
        return result;
    }
}