class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        final int N = 1001;
        var set = new int [N];
        for (var i : nums1) set[i] = 1;
        int resCount = 0;
        for (var i : nums2) {
            if (set[i] == 1) {
                set[i] = 2;
                ++resCount;
            }
        }
        var res = new int[resCount];
        var i = 0;
        var nums = nums2.length > nums1.length ? nums1 : nums2;
        for (var v : nums) {
            if (set[v] == 2) {
                res[i++] = v;
                set[v] = 1;
            }
        }
        return res;
    }
}