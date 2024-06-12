class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for(int i : nums) {
            colors[i]++;
        }

        int po = 0;
        for(int i = 0 ; i < 3 ; i++) {
            while(colors[i] > 0) {
                nums[po] = i;
                colors[i]--;
                po++;
            }
        }
    }
}