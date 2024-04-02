class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Character[] map = new Character[128];
        Character[] reverse = new Character[128];
        for(int i = 0 ; i < s.length() ; i++) {
            char a1 = s.charAt(i);
            char a2 = t.charAt(i);
            
            Character result = map[a1];
            Character res = reverse[a2];
            if(result == null) {
                if(res != null) return false;
                map[a1] = a2;
                reverse[a2] = a1;
            } else {
                if(result != a2) {
                    return false;
                }
                
                if(res != a1) {
                    return false;
                }
            }
        }        
        return true;
    }
}