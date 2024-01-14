class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        for(char c : word1.toCharArray()) {
            char1[c-'a']++;
        }
        
        Map<Integer, Integer> counts1 = new HashMap();
        for(int i = 0 ; i < char1.length ; i++) {
            counts1.put(char1[i], counts1.getOrDefault(char1[i],0)+1);
        }
        
        for(char c : word2.toCharArray()) {
            char2[c-'a']++;
        }
        
        Map<Integer, Integer> counts2 = new HashMap();
        for(int i = 0 ; i < char2.length ; i++) {
            counts2.put(char2[i], counts2.getOrDefault(char2[i],0)+1);
        }
        
        for(int i = 0 ; i < char1.length ; i++) {
            if(char1[i] != 0 && char2[i] == 0) {
                return false;
            }
            
            if(char2[i] != 0 && char1[i] == 0) {
                return false;
            }
        }
        
        for(Map.Entry<Integer, Integer> value : counts1.entrySet()) {
            Integer cv2 = counts2.get(value.getKey());
            
            if(cv2 == null || cv2 != value.getValue()) {
                return false;
            }
        }
        
        return true;
        
    }
}