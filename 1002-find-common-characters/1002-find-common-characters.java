class Solution {
    public List<String> commonChars(String[] words) {
        int[][] array = new int[words.length][26];        

        for(int i = 0 ; i < words.length ; i++) {
            char[] chars = words[i].toCharArray();
            for(int k = 0 ; k < chars.length; k++) {
                array[i][chars[k]-'a']++;
            }            
        }

        List<String> results = new ArrayList();
        for(int k = 0 ; k < 26 ; k++) {                
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < words.length ; i++) {
                min = Math.min(min, array[i][k]);
                if(min == 0) break;
            }
            
            if(min != 0) {
                for(int l = 0 ; l < min ; l++) {
                    results.add(getCharString(k));
                }
            }
        }

        return results;

    }

    private static final String[] cache;

    static {
        cache = new String[26];
        for (int i = 0; i < 26; i++) {
            cache[i] = Character.toString((char) ('a' + i));
        }
    }

    public String getCharString(int k) {
        return cache[k];
    }
}