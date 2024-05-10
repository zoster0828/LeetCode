class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int counts = arr.length * (arr.length-1) / 2;
        int[][] pairs = new int[counts][2];
        int left = 0 , right = arr.length-1;
        int po = 0;
        for(int i = 1 ; i < arr.length ; i++) {
            for(int j = 0 ; j < i ; j++) {
                pairs[po++] = new int[]{arr[j], arr[i]};                
            }
        }
        
        Arrays.sort(pairs, (x, y) -> Double.compare((float)x[0] / (float)x[1], (float)y[0] / (float)y[1]));
        
        return pairs[k-1];
    }
}