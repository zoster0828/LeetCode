class Solution {
    public int[] sortArray(int[] nums) {        
        int range[] = new int[100001];
        
        for(int num : nums) {
            range[num+50000]++;
        }
        int result[] = new int[nums.length];
        int po = 0;
        for(int i = 0 ; i < range.length ; i++) {
            while(range[i] > 0) {
                result[po] = i-50000;
                range[i]--;
                po++;
            }            

            if(po == result.length) {
                break;
            }
        }

        return result;
    }
}