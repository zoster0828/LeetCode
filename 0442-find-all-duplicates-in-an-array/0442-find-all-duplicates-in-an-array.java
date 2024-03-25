class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] dup = new int[nums.length+1];
        
        for(int i = 0 ; i < nums.length ; i++) {
            dup[nums[i]]++;
        }
        
        List<Integer> result = new ArrayList();
        for(int i = 0 ; i < dup.length ; i++) {
            if(dup[i] > 1) {
                result.add(i);
            }
        }
        
        return result;
    }
}