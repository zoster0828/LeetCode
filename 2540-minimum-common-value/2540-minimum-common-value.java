class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int a = nums1.length;
        int b = nums2.length;
        if(nums1[a-1] < nums2[0] || nums2[b-1] < nums1[0]) return -1;
        
        while(i < a && j < b){
            if(nums1[i] == nums2[j]) {
                return nums1[i];
            }
            
            if(nums1[i] > nums2[j]) {
                j++;                
                continue;
            }
            
            if(nums1[i] < nums2[j]) {
                i++;                
            }
        }
        
        return -1;
    }
}