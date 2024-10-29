class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer, Integer> set = new HashMap();
        
        for(int num : nums) {
            if(set.containsKey(num)) {
                set.compute(num, (key, value) -> value+1);
            } else {
                set.put(num, 1);
            }
        }

        for(int i = 0 ; i < n - 1 ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                int candidate = (nums[i] +  nums[j]) * -1;
                
                if(candidate >= 100001 || candidate <= -100001) continue;

                if(set.containsKey(candidate)) {
                    int count = set.get(candidate);
                    if(candidate == nums[i]) {
                        count--;
                    }
                    if(candidate == nums[j]) {
                        count--;
                    }
                    if(count <= 0) continue;
                    
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(candidate);
                    Collections.sort(list);
                    result.add(list);
                }
            }
        }

        return new ArrayList(result);
    }
}