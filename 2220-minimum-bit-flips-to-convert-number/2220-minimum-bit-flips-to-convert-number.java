class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String s2 = Integer.toBinaryString(goal);
        int len = Math.max(s.length(), s2.length());
        while(s.length() < len) {
            s = "0"+s;
        }

        while(s2.length() < len) {
            s2 = "0"+ s2;
        }
        int result = 0;
        for(int i = 0 ; i < len; i++) {
            if(s.charAt(i) != s2.charAt(i)) result++;
        }

        return result;
    }
}