class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i ++) {
            if(nums[i] < prev) {
                pivot = i;
                break;
            } else {
                prev = nums[i];
            }
        }

        int left = 0;
        int right = nums.length-1;

        return binarySearch(nums, left, right, target, pivot);
    }

    public int binarySearch(int[] nums, int left, int right, int target, int pivot){

        while(left <= right) {
            int mid = left + ((right - left) / 2);
            int value = nums[(mid+pivot)%nums.length];
            if(value == target) {
                return (mid+pivot)%nums.length;
            }

            if(value < target) {
                return binarySearch(nums, left + ((right - left) / 2)+1, right, target, pivot);
            } else {
                return binarySearch(nums, left, left + ((right - left) / 2)-1, target, pivot);
            }
        }
        return -1;
    }
}