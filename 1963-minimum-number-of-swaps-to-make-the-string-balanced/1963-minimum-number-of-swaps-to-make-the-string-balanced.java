class Solution {
    public int minSwaps(String s) {
        int n = s.length();

        int left = 0;

        int swap = 0;
        for(int i = 0 ; i < n ; i++) {
            char c = s.charAt(i);
            if(c == '[') {
                left ++;         
            } else {
                if(left > 0) {                    
                    left --; 
                } else {                    
                    left ++;
                    swap++; 
                }
            }
        }

        return swap;
    }
}