class Solution {
    public long countBadPairs(int[] nums) {
        
        int n = nums.length;
        long bad = ((long)n * (n-1))/2;
        Map<Integer, Integer> diffs = new HashMap();
        
        for(int i = 0 ; i < n ; i++) {
            int key = nums[i] - i;            
            diffs.put(key, diffs.getOrDefault(key, 0) +1);
        }

        for(Map.Entry<Integer, Integer> entry : diffs.entrySet()) {
            int num = entry.getValue();
            bad -= ((long)num * (num-1)) / 2;
        }
        

        return bad;
    }    
}