class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int a = nums1.length;
        int b = nums2.length;
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