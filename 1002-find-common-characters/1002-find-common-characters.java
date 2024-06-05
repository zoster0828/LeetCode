class Solution {
    public List<String> commonChars(String[] words) {
        int[][] array = new int[words.length][26];        

        for(int i = 0 ; i < words.length ; i++) {
            for(int k = 0 ; k < words[i].length() ; k++) {
                array[i][words[i].charAt(k)-'a']++;
            }            
        }

        List<String> results = new ArrayList();
        for(int k = 0 ; k < 26 ; k++) {                
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < words.length ; i++) {
                min = Math.min(min, array[i][k]);
            }
            
            if(min != 0) {
                for(int l = 0 ; l < min ; l++) {
                    results.add(((char)(k+'a'))+"");
                }
            }
        }

        return results;

    }
}