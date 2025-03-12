class Solution {
    public int maximumCount(int[] nums) {
        int po = 0;
        int ne = 0;
        for(int num : nums) {
            if(num > 0) {
                po++;
            } else if( num < 0) {
                ne++;
            }
        }

        return Math.max(po, ne);
    }
}