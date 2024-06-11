class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i : arr1) {
            count[i]++;
        }

        int[] result = new int[arr1.length];
        int po = 0;
        for(int i = 0 ; i < arr2.length ; i++) {
            while(count[arr2[i]] != 0) {
                result[po] = arr2[i];
                po++;
                count[arr2[i]]--;
            }
        }

        for(int i = 0 ; i < count.length ; i++) {
            while(count[i] != 0) {
                result[po] = i;
                po++;
                count[i]--;
            }
        }

        return result;
    }
}