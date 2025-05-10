class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long n0 = 0;
        long nsum = 0;
        for(int n : nums1) {
            if(n == 0) {
                n0++;
            } else {
                nsum += n;
            }
        }

        long m0 = 0;
        long msum = 0;
        for(int n : nums2) {
            if(n == 0) {
                m0++;
            } else {
                msum += n;
            }
        }

        if(n0 == 0 && nsum < msum+m0) {
            return -1;
        }
        if(m0 == 0 && msum < nsum+n0) {
            return -1;
        }

        return Math.max(msum+m0, nsum+n0);
    }
}