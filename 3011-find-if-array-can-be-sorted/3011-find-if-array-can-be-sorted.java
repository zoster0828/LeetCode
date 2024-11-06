class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;

        int[] oneCount = new int[257];
        
        for(int i = 0 ; i < n ; i++) {
            oneCount[nums[i]] = countOne(nums[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    if(oneCount[nums[j]] != oneCount[nums[j+1]]) return false;

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return true;
    }

    private int countOne(int num) {
        String binary = Integer.toBinaryString(num);
        int result = 0;
        for(int i = 0 ; i < binary.length() ; i++) {
            if(binary.charAt(i) == '1') result++;
        }

        return result;
    }
}