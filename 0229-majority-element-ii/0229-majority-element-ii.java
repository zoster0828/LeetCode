class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int v = nums.length / 3 + 1;
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Integer> result = new ArrayList();
        map.forEach((key, value) -> {
	        if(value >= v) {
                result.add(key);
            }
        });
        return result;
    }
}