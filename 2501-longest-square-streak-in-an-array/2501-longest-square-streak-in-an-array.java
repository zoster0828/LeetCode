class Solution {
    public int longestSquareStreak(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap();

        int result = -1;
        // for(int i = n-1 ; i >- 0 ; i--) {
        for(int i = 0 ; i < n ; i++) {
            int square = nums[i]*nums[i];
            if(map.containsKey(nums[i])) {
                int temp = map.get(nums[i])+1;
                result = Math.max(result, temp);
                map.put(square, temp);
            } else {
                map.put(square, 1);
            }
        }

        return result;
    }
}