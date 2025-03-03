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
        int a = less.size();
        int b = greater.size();
        for( ; i < a ; i++) {
            result[i] = less.get(i);
        }
        for(; i < a + equals ; i++) {
            result[i] = pivot;
        }
        for( ; i < a + equals + b ; i++) {
            result[i] = greater.get(i - equals - a);
        }

        return result;
    }
}