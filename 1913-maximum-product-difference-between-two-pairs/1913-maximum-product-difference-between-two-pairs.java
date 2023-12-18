class Solution {
    public int maxProductDifference(int[] nums) {
        int top[] = new int[2];
        int min[] = new int[]{100000,100001};
        
        for(int num : nums) {
            if(num > top[1]) {
                if(num > top[0]) {
                    top[1] = top[0];
                    top[0] = num;
                } else {
                    top[1] = num;
                }                
            }
            
            if(num < min[1]) {
                if(num < min[0]) {
                    min[1] = min[0];
                    min[0] = num;
                } else {
                    min[1] = num;
                }                
            }
        }
        
        return (top[0] * top[1]) - (min[1]*min[0]);
    }
}