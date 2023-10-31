class Solution {
    public int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        int[] temp = new int[pref.length];
        result[0] = pref[0];
        temp[0] = pref[0];
        for(int i = 1 ; i < pref.length ; i++) {                        
            result[i] = temp[i-1] ^ pref[i];
            temp[i] = temp[i-1] ^ result[i];
        }
        
        return result;
    }
}