class Solution {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        String candid1 = x > y ? "ab" : "ba";
        String candid2 = x > y ? "ba" : "ab";
        StringBuilder builder = new StringBuilder();
        int result = 0;
        for(int i = 0 ; i < n ; i++) {
            if(i == n - 1) {
                builder.append(s.charAt(i));
                continue;
            } 
            
            String str = s.charAt(i) +""+ s.charAt(i+1);
            if(str.equals(candid1)) {
                result += x > y ? x : y;
                continue;
            }            
            builder.append(s.charAt(i));
        }
        
        s = builder.toString();
        n = s.length();
        for(int i = 0 ; i < n ; i++) {
            if(i == n - 1) {
                continue;
            } 
            
            String str = s.charAt(i) +""+ s.charAt(i+1);
            if(str.equals(candid2)) {
                result += x > y ? y : x;
                continue;
            }            
        }
        
        return result;
    }
}