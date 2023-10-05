class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int v = nums.length / 3 + 1;
        List<Integer> result = new ArrayList();

        Arrays.sort(nums);
        
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for(int num : nums) {
            if(num == prev) {
                count++;
            } else {
                if(count >= v) {
                    result.add(prev);                    
                }
                
                prev = num;
                count = 1;
            }
        }
        
        if(count >= v) {
            result.add(prev);                    
        }
        
        return result;
    }
}