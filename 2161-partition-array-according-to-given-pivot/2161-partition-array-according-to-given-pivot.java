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

        for(int i = 0 ; i < equals ; i++) {
            less.add(pivot);
        }

        less.addAll(greater);

        return less.stream().mapToInt(it -> it).toArray();
    }
}