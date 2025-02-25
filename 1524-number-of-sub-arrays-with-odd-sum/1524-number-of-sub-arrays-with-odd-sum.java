class Solution {
    public int numOfSubarrays(int[] arr) {
        long sum = 0;
        long odd = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
            odd += sum % 2;         
        }

        odd += (arr.length - odd) * odd;
        return (int) (odd  % 1000000007);
    }
}