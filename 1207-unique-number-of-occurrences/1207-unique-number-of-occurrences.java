class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int nums[] = new int[2001];
        for(int i : arr) {
            nums[i+1000]++;
        }
        
        Set<Integer> set = new HashSet();
        
        for(int i : nums) {
            if(i == 0) continue;
            
            if(set.contains(i)) return false;
            
            set.add(i);
        }
        
        return true;
    }
}