class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int counts = arr.length * (arr.length-1) / 2;
        float[][] pairs = new float[counts][2];
        int left = 0 , right = arr.length-1;
        int po = 0;
        for(int i = 1 ; i < arr.length ; i++) {
            for(int j = 0 ; j < i ; j++) {
                pairs[po++] = new float[]{arr[j], arr[i]};                
            }
        }
        
        Arrays.sort(pairs, (x, y) -> Double.compare(x[0] / x[1], y[0] / y[1]));
        
        return new int[]{(int)pairs[k-1][0], (int)pairs[k-1][1]};
    }
}