class Solution {
    public int[] pivotArray(int[] nums, int pivot) {        
        int n = nums.length;
        int[] less = new int[n];
        int l = 0;
        int[] equal = new int[n];
        int e = 0;
        int[] greater = new int[n];        
        int g = 0;
        for(int i = 0 ; i < n ; i ++) {
            if(nums[i] < pivot) {
                less[l++] = nums[i];
            } else if(nums[i] > pivot) {
                greater[g++] = nums[i];
            } else {
                equal[e++] = nums[i];
            }
        }
        int result[] = new int[n];        
        int po = 0;
        int i = 0;
        while(i < l) {
            result[po++] = less[i++];
        }

        i = 0;
        while(i < e) {
            result[po++] = equal[i++];
        }

        i = 0;
        while(i < g) {
            result[po++] = greater[i++];
        }

        return result;
    }
}