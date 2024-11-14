class Solution {
    public int minimizedMaximum(int n, int[] quantities) {        
        int max = 0;
        for(int quantity : quantities) {
            max = Math.max(max, quantity);
        }

        int left = 1;
        int right = max;


        while(left <= right) {
            int mid = left + ((right-left) / 2);
            int curr = 0;
            for(int quantity : quantities) {
                int divide = quantity / mid;
                if(quantity % mid != 0) {
                    divide++;
                }
                curr += divide;
            }            

            if(curr > n) left = mid+1;
            else right = mid - 1;
        }

        return left;
    }
}