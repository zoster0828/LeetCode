class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] one = new int[1001];
        int[] two = new int[1001];
        
        for(int num : nums1) {
            one[num]++;
        }
        
        int size = 0;
        for(int num : nums2) {
            if(one[num] > 0) {
                if(two[num] == 0) {
                    size++;
                }
                
                two[num]++;
            }             
        }        
        
        int[] r = new int[size];
        int[] a = (nums1.length < nums2.length ? nums1 : nums2);
        for(int i = 0, j =0 ; i < a.length ; i++) {
            if(two[a[i]] > 0) {
                r[j] = a[i];
                j++;
                two[a[i]] = 0;
                if(j == size) {break;}
            }
        }
        
        return r;
    }
}