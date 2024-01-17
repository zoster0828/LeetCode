class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int nums[] = new int[2001];
        for(int i : arr) {
            nums[i+1000]++;
        }
        
        boolean[] exists = new boolean[1001];
        for(int i : nums) {
            if(i!=0) {
                if(exists[i]) return false;
                
                exists[i] = true;
            }
        }
        
        return true;
    }
}