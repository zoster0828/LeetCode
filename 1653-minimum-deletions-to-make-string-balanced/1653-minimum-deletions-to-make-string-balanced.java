class Solution {
    public int minimumDeletions(String s) {        
        int poA = -1;
        int poB = -1;
        int n = s.length();

        for(int i = 0 ; i < n ; i++) {
            if(s.charAt(i) == 'a') {
                poA = i;
            }

            if(s.charAt(i) == 'b' && poB == -1) {
                poB = i;
            }
        }

        if(poA == -1 || poB == -1) return 0;

        int bCount = -1;
        int aCount = -1;
        for(int i = 0 ; i < n ; i++) {
            if(i < poA && s.charAt(i) == 'b') {
                bCount++;
            }
            if(i > poB && s.charAt(i) == 'a') {
                aCount++;
            }
        }

        if(bCount == -1 && aCount == -1) return 0;
        if(bCount == -1) return aCount+1;
        if(aCount == -1) return bCount+1;
        return Math.min(aCount, bCount) + 1;
    }
}