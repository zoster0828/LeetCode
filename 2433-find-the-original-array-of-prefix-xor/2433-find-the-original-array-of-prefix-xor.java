class Solution {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];        
        int prev = pref[0];
        for(int i = 1 ; i < pref.length ; i++) {                        
            result[i] = prev ^ pref[i];
            prev = prev ^ result[i];
        }
        
        return result;
    }
}