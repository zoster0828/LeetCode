class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int weight : weights) {
            max = Math.max(max, weight);
            sum += weight;
        }
        int left = max;
        int right = sum;
        
        while(left < right) {
            int mid = (left + right) / 2;
            int curr = 0;            
            int currDays = 1;
            for(int weight : weights) {
                if(curr + weight > mid) {
                    curr = 0;
                    currDays++;
                }
                curr += weight;
            }

            if(currDays > days) {
                left = mid + 1;
            } else {
                right = mid;
            } 
        }

        return left;
    }    
}