class Solution {
    public int findLucky(int[] arr) {
        int count[] = new int[501];
        for(int a : arr) {
            count[a]++;
        }

        int result = -1;
        for(int i = 1 ; i < 501 ; i++) {
            if(count[i] == i) result=i;
        }

        return result;
    }
}