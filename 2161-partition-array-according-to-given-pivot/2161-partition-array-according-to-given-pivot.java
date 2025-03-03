class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList();
        List<Integer> greater = new ArrayList();
        int n = nums.length;
        int equals = 0;
        for(int i = 0 ; i < n ; i ++) {
            if(nums[i] < pivot) {
                less.add(nums[i]);
            } else if(nums[i] > pivot) {
                greater.add(nums[i]);
            } else {
                equals++;
            }
        }
        int result[] = new int[n];
        int i = 0;
        for( ; i < less.size() ; i++) {
            result[i] = less.get(i);
        }
        for(; i < less.size() + equals ; i++) {
            result[i] = pivot;
        }
        for( ; i < less.size() + equals + greater.size() ; i++) {
            result[i] = greater.get(i - equals - less.size());
        }

        return result;
    }
}