class Solution {
    public int minSwaps(String s) {
        int n = s.length();

        int left = 0;

        int swap = 0;
        for(int i = 0 ; i < n ; i++) {
            char c = s.charAt(i);

            if(c == '[') {
                left ++;         
            }

            if(c == ']') {
                if(left == 0) {                    
                    left ++;
                    swap++;                    
                    continue;
                }

                if(left > 0) {
                    left --;
                }
            }
        }

        return swap;
    }
}