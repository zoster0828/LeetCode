class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consecutive = 0;
        for(int num : arr) {
            if(num % 2 != 0) {
                consecutive++;
            } else {
                consecutive = 0;
            }

            if(consecutive == 3) return true;
        }

        return false;
    }
}