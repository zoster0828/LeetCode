class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] one = new int[1001];        
        
        for(int num : nums1) {
            one[num] = 1;
        }
        
        int size = 0;
        for(int num : nums2) {
            if(one[num] == 1) {
                size++;
                one[num] = 2;
            }             
        }        
        
        int[] r = new int[size];
        int[] a = (nums1.length < nums2.length ? nums1 : nums2);
        for(int i = 0, j =0 ; i < a.length ; i++) {
            if(one[a[i]] == 2) {
                r[j] = a[i];
                j++;
                one[a[i]] = 0;
                if(j == size) {break;}
            }
        }
        
        return r;
    }
}