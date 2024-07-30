class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] countOne = new int[n + 1];
        int[] countZero = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            countOne[i] = countOne[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
            countZero[i] = countZero[i - 1] + (s.charAt(i - 1) == '0' ? 1 : 0);
        }
        
        int validSubstrings = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                int ones = countOne[end] - countOne[start];
                int zeros = countZero[end] - countZero[start];
                if (ones >= zeros * zeros) {
                    validSubstrings++;
                }
            }
        }
        return validSubstrings;
    }
}
