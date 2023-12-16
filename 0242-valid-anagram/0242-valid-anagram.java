class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(a.length != b.length) {
            return false;
        }
        
        int[] nums = new int[26];
        
        for(char c : a) {
            nums[c-'a']++;
        }
        
        for(char c : b) {
            nums[c-'a']--;
            if(nums[c-'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}