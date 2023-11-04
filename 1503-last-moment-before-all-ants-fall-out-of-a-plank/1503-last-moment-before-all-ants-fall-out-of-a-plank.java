class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftmax = 0;
        for(int i = 0 ; i < left.length ; i++) {
            leftmax = Math.max(leftmax, left[i]);
        }
        
        int rightmax = 0;
        for(int i = 0 ; i < right.length ; i++) {
            rightmax = Math.max(rightmax, n - right[i]);
        }
        
        return Math.max(rightmax, leftmax);
    }
}