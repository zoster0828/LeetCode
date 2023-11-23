class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList();
        for(int i = 0 ; i < l.length ; i++) {
            int[] sub = sub(nums, l[i], r[i]);
            
            Arrays.sort(sub);
            
            result.add(isArith(sub));
        }
        return result;
    }
    
    int[] sub(int[] nums, int left, int right) {
        int[] result = new int[right-left+1];
        
        for(int i = 0; i < result.length ; i++) {
            result[i] = nums[left++];
        }
        
        return result;
    }
    
    boolean isArith(int[] sub) {
        Integer diff = null;        
        for(int i = 1 ; i < sub.length ; i++) {
            if(diff == null) {
                diff = sub[i] - sub[i-1];
            } else {
                int temp = sub[i] - sub[i-1];
                if(diff != temp) {
                    return false;
                }
            }
        }
        
        return true;
    }
}