class Solution {
    public String customSortString(String order, String s) {
        char[] input = s.toCharArray();
        
        int[] exists = new int[26];
        for(int i = 0 ; i < input.length ; i++) {
            if(order.contains(input[i]+"")) {
                exists[input[i]-'a']++;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < order.length() ; i++) {
            while(exists[order.charAt(i) - 'a'] > 0) {
                result.append(order.charAt(i));
                if(exists[order.charAt(i) - 'a'] == 1) {
                    break;
                }
                
                exists[order.charAt(i) - 'a']--;
            }
        }
        
        for(int i = 0 ; i < input.length ; i++) {
            if(exists[input[i] - 'a'] == 1) {
                continue;
            } else {
                result.append(input[i]);
            }
        }
        
        return result.toString();
    }
}