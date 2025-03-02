class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0;
        int right = 0;
        int n = nums1.length;
        int m = nums2.length;
        int max = 0;

        Map<Integer, Integer> map = new HashMap();
        for(int i = 0 ; i < Math.max(nums1.length, nums2.length) ; i++) {
            if(left < n) {
                int t = map.getOrDefault(nums1[i][0], 0);
                map.put(nums1[i][0], t+nums1[i][1]);
                max = Math.max(max, nums1[i][0]);
                left++;
            }
            if(right < m) {
                int t = map.getOrDefault(nums2[i][0], 0);
                map.put(nums2[i][0], t+nums2[i][1]);
                max = Math.max(max, nums2[i][0]);
                right++;
            }
        }
        int ans[][] = new int[map.size()][2];
        int i=0;
        for(int key : map.keySet()){
            ans[i++] = new int[] {key,map.get(key)};
        }
        Arrays.sort(ans, (a,b) -> a[0]-b[0]);
        return ans;
    }
}