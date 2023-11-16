class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int length = nums[0].length();
        
        Set<Integer> set = new HashSet();
        for(String str : nums) {
            int value = Integer.parseInt(str, 2);
            set.add(value);
        }
        
        int start = 0;
        while(true) {
            if(!set.contains(start)) {
                String result = Integer.toBinaryString(start);
                while(result.length() < length) {
                    result = "0"+result;
                }
                return result;
            }
            start++;
        }
    }
}