class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] one = new int[1001];
        int[] two = new int[1001];
        
        for(int num : nums1) {
            one[num]++;
        }
        
        for(int num : nums2) {
            if(one[num] > 0) {
                two[num]++;
            }             
        }
        
        boolean[] result = new boolean[1001];
        
        int size = 0;
        for(int i = 0 ; i < 1001 ; i++) {
            if(two[i] > 0) {
                result[i] = true;
                size++;
            }
        }
        
        int[] r = new int[size];
        
        for(int i = 0, j =0 ; i < 1001 ; i++) {
            if(result[i]) {
                r[j] = i;
                j++;
                if(j == size) {break;}
            }
        }
        
        return r;
    }
}