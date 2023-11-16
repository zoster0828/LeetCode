class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < nums.length ; i++) {
            
            if(nums[i].charAt(i) == '1') {
                builder.append('0');
            } else {
                builder.append('1');
            }
        }
        
        return builder.toString();
    }
}