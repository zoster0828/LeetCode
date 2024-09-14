public class Solution {
    public int longestSubarray(int[] nums) {
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        
        int maxLen = 0;
        int currentLen = 0;
        
        for (int num : nums) {
            if (num == maxNum) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }
        
        return maxLen;
    }
}
