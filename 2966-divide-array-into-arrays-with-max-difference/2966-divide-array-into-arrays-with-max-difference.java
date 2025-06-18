class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length % 3 != 0) return new int[0][0];
        sort(nums);

        int[][] result = new int[nums.length/3][3];
        for(int i = 0 ; i < nums.length -2 ; i+=3) {
            if(nums[i] + k >= nums[i+2]) {
                result[i/3][0] = nums[i];
                result[i/3][1] = nums[i+1];
                result[i/3][2] = nums[i+2];
            } else {
                return new int[0][0];
            }
        }

        return result;
    }

    private void sort(int[] nums) {
        int max = 0;
        for (int num: nums) {
            max = Math.max(max, num);
        }

        int[] counts = new int[max + 1];
        for (int num: nums) {
            counts[num]++;
        }

        int k = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                nums[k++] = i;
                counts[i]--;
            }
        }
    }
}