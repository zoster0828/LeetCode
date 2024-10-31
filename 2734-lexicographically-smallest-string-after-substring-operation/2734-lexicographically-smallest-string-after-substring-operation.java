class Solution {
    public String smallestString(String s) {
        boolean start = false;
        char[] chars = s.toCharArray();
        int n = chars.length;
        for(int i = 0 ; i < n ; i++) {
            if(!start && chars[i] != 'a') {
                start = true;
            }

            if(start && chars[i] != 'a') {
                chars[i] = (char) (chars[i]-1);
                continue;
            }

            if(start && chars[i] == 'a') {
                break;
            }
        }

        if(!start) {
            chars[n-1] = 'z';
        }

        return new String(chars);
    }
}