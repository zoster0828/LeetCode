class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) {return new int[]{-1,-1};}
        int po = Arrays.binarySearch(nums, target);
        if(po < 0) {
            return new int[]{-1,-1};
        }
        int start = -1;
        int end = -1;
        for(int i = po ; i < nums.length ; i++) {
            if(nums[i] == target) {
                end = i;
            } else {
                break;
            }
        }

        for(int i = po ; i >= 0 ; i--) {
            if(nums[i] == target) {
                start = i;
            } else {
                break;
            }
        }

        return new int[]{start, end};
    }
}