class Solution {
    public int nonSpecialCount(int l, int r) {
        int cnt = 0;
        for(int i=2; i*i <= r; i++) {
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime) {
                int mul = i*i;
                if(mul >= l && mul <= r) {
                    cnt++;
                } 
            }
        }

        return r-l+1 - cnt;
    }
}