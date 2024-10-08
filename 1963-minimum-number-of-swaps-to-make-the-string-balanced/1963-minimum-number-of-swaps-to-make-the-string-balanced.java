class Solution {
    public int minSwaps(String s) {

        int left = 0;

        int swap = 0;
        char cs[] = s.toCharArray();
        int n = c.length;
        for(int i = 0 ; i < n ; i++) {
            char c = cs[i];
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