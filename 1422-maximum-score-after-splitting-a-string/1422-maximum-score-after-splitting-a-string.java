class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int max = s.charAt(0) == '0' ? 1 : 0;
        for(int i = 1 ; i < n ; i++) {
            if(s.charAt(i) == '1') {
                max++;
            }
        }

        int temp = max;
        for(int i = 1 ; i < n-1 ; i++) {
            if(s.charAt(i) == '0') {
                temp++;                
            } else {
                temp--;
            }

            max = Math.max(max, temp);
        }

        return max;
    }
}