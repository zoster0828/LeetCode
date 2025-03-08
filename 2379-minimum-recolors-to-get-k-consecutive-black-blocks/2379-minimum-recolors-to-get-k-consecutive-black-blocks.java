class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int count = 0;
        for(int i = 0 ; i < k ; i++) {
            if(blocks.charAt(i) == 'B') {
                count++;
            }
        }
        
        int min = count;
        for(int i = 1 ; i < n - k +1 ; i++) {            
            if(blocks.charAt(i-1) != blocks.charAt(i-1+k)) {
                if(blocks.charAt(i-1) == 'W') count++;
                else count--;
                min = Math.max(count, min);
            }
            if(min > k) {
                min = k;
                if(min==k) return 0;
            }
        }

        return k-min;
    }
}