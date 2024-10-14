class Solution {
    public long maxKelements(int[] nums, int k) {
        long result = 0;
        int n = nums.length;
        int i = 0;

        PriorityQueue<Integer> queue = new PriorityQueue();
        for(int num : nums) {
            queue.add(num);
        }

        int range = 0;
        Arrays.sort(nums);
        while(i < k) {
            result += nums[n - 1];
            nums[n - 1] = ceil(nums[n - 1]);
            i++;
            if(range == n-1) {
                range = 0;
            }
            Arrays.sort(nums, n- (++range) -1 , n);            
        }

        return result;
    }


    public int ceil(int num) {
        return num % 3 == 0 ? num  / 3 : (num / 3) + 1;
    }
}