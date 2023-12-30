class Solution {
    public boolean makeEqual(String[] words) {
        int length = words.length;
        int[] counts = new int[26];
        for(String str : words) {
            for(char c : str.toCharArray()) {
                counts[c-'a']++;
            }
        }

        for(int c : counts) {
            if(c % length != 0) {
                return false;
            }
        }

        return true;
    }
}