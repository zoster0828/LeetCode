class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int count = 0;
        for(int i = 0 ; i < k ; i++) {
            if(blocks.charAt(i) == 'B') {
                count++;
            }
        }
        if(count == k) return 0;
        if(n == k) return k-count;
        
        int min = count;
        for(int i = 1 ; i < n - k +1 ; i++) {
            if(count == k) return 0;
            count += blocks.charAt(i-1) == 'W' ? 0 : -1;
            count += blocks.charAt(i-1+k) == 'W' ? 0 : 1;
            System.out.println(min);
            min = Math.max(count, min);
        }

        return k-min;
    }
}