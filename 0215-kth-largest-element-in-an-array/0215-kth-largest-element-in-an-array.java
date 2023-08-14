class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        
        return nums[nums.length-k];
    }

    public void replace(int[] top, int num) {
        if(top[0] <= num) {
            top[0] = num;
        }

        for(int i = 0 ; i< top.length -1; i ++) {
            if(top[i] > top[i+1]) {
                int temp = top[i+1];
                top[i+1] = top[i];
                top[i] = temp;
            } else {
                break;
            }
        }
    }
}