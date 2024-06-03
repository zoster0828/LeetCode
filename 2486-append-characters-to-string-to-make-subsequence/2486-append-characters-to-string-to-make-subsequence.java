class Solution {
    public int appendCharacters(String s, String t) {
        int po = 0;
        int tlen = t.length();
        int slen = s.length();
        for(int i = 0 ; i < slen ; i++) {
            char c = s.charAt(i);
            if(po >= tlen) return 0;

            if(t.charAt(po) == c) {
                po++;
            }
        }

        return tlen - po;
    }
}