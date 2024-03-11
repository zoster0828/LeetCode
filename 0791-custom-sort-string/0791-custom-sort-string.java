class Solution {
    public String customSortString(String order, String s) {
        boolean[] orders = new boolean[26];
        for(int i = 0 ; i < order.length() ; i++) {
            orders[order.charAt(i)-'a'] = true;
        }
        
        
        int[] exists = new int[26];
        StringBuilder tail = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++) {
            if(orders[s.charAt(i)-'a']) {
                exists[s.charAt(i)-'a']++;
            }else {
                tail.append(s.charAt(i));
            }                        
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < order.length() ; i++) {
            while(exists[order.charAt(i) - 'a'] > 0) {
                result.append(order.charAt(i));
                exists[order.charAt(i) - 'a']--;
            }
        }
        
        return result.toString() + tail.toString();
    }
}