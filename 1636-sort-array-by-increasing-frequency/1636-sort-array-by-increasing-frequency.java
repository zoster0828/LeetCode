class Solution {
    public int[] frequencySort(int[] nums) {
        int[][] frequencies = new int[201][2];
        for (int num : nums) {
            frequencies[num + 100][0]++;
            frequencies[num + 100][1] = num;
        }

        Arrays.sort(frequencies, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int[] result = new int[nums.length];
        int po = 0;
        for (int[] freq : frequencies) {
            while (freq[0] > 0) {
                result[po] = freq[1];
                po++;
                freq[0]--;
            }
        }

        return result;
    }
}