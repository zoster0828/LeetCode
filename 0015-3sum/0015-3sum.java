class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();    

        for(int i = 0 ; i < n - 2 ; i++) {
            int j = i+1;
            int k = n-1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;                        
                    }
                }

                if(sum > 0) {
                    k--;
                    continue;
                }

                if(sum < 0) {
                    j++;
                    continue;
                }
            }
        }

        return new ArrayList(result);
    }
}

//-4, -1, -1, 0, 1,2,
// -4 i, -1 j, 2 k