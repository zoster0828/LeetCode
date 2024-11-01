class Solution {
    public String makeFancyString(String s) {
        int continuous = 1;
        char[] chars = s.toCharArray();
        int n = chars.length;
        char prev = chars[0];

        StringBuilder builder = new StringBuilder();   
        builder.append(prev);        
        for(int i = 1 ; i < n ; i++) {
            char curr = chars[i];
            if(curr == prev) {
                continuous++;
            } else {
                continuous = 1;
                prev = curr;
            }

            if(continuous >= 3) {
                continue;
            } else {
                builder.append(curr);
            }
        }

        return builder.toString();
    }
}