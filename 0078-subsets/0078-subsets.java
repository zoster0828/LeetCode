class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int numberOfSubsets = 1 << nums.length;

        for (int subsetMask = 0; subsetMask < numberOfSubsets; subsetMask++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    currentSubset.add(nums[i]);
                }
            }
            subsets.add(currentSubset);
        }

        return subsets;
    }
}