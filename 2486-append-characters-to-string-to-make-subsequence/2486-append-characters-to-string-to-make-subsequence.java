class Solution {
    public int appendCharacters(String s, String t) {
        int ti = 0;
        int si = 0;
        int tlen = t.length();
        int slen = s.length();
        while(si < slen && ti < tlen) {
            if(s.charAt(si) == t.charAt(ti)) {
                ti++;
            }

            si++;
        }

        return tlen - ti;        
    }
}