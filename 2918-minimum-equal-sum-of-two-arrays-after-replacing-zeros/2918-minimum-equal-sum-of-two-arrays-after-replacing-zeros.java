class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n = nums1.length;        
        long n0 = 0;
        long nsum = 0;
        for(int i = 0 ; i <  n ; i++) {
            if(nums1[i] == 0) {
                n0++;
            } else {
                nsum += nums1[i];
            }
        }

        int m = nums2.length;
        long m0 = 0;
        long msum = 0;
        for(int i = 0 ; i <  m ; i++) {
            if(nums2[i] == 0) {
                m0++;
            } else {
                msum += nums2[i];
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