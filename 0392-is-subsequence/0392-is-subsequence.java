class Solution {
    public boolean isSubsequence(String s, String t) {        
        char[] input = s.toCharArray();
        char[] output = t.toCharArray();
        
        int o = 0;
        for(int i = 0 ; i < input.length ;i++) {
            boolean exists = false;
            for(; o < output.length ; o++) {
                if(input[i] == output[o]) {
                    exists = true;
                    o++;
                    break;
                }                
            }
            if(! exists) return false;
        }

        return true;
    }
}