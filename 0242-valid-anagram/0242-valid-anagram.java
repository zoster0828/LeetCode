class Solution {
    public boolean isAnagram(String s, String t) {
        int[] nums = new int[26];
        
        for(char c : s.toCharArray()) {
            nums[c-'a']++;
        }
        
        for(char c : t.toCharArray()) {
            nums[c-'a']--;
            if(nums[c-'a'] < 0) {
                return false;
            }
        }
        
        for(int num : nums) {
            if(num > 0) {
                return false;
            }
        }
        
        return true;
    }
}