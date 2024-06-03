class Solution {
    public int appendCharacters(String s, String t) {
        int po = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(po < t.length() && t.charAt(po) == c) {
                po++;
            }
        }

        return t.length() - po;
    }
}