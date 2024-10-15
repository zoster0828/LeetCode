class Solution {
    public long minimumSteps(String s) {
        long result = 0;
        int n = s.length();

        int accum = 0;
        for(int i = 0 ; i < n ; i ++) {
            char c = s.charAt(i);
            if(c == '1') {
                accum++;
            } else {
                result += accum;
            }
        }

        return result;
    }
}