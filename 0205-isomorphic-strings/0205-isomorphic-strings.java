class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap();
        Map<Character, Character> reverse = new HashMap();
        for(int i = 0 ; i < s.length() ; i++) {
            char a1 = s.charAt(i);
            char a2 = t.charAt(i);
            
            Character result = map.get(a1);
            Character res = reverse.get(a2);
            if(result == null) {
                if(res != null) return false;
                map.put(a1, a2);
                reverse.put(a2,a1);
            } else {
                if(result != a2) {
                    return false;
                }
                
                if(reverse.get(a2) != a1) {
                    return false;
                }
            }
        }        
        return true;
    }
}