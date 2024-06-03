class Solution {
    public int appendCharacters(String s, String t) {
        int po = 0;
        int n = t.length();
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(po >= n) break;

            if(t.charAt(po) == c) {
                po++;
            }
        }

        return t.length() - po;
    }
}