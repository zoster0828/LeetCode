class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.toCharArray().length != t.toCharArray().length) {
            return false;
        }
        
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
        
        return true;
    }
}