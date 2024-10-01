class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int candid[] = new int[k];

        for(int i = 0 ; i < n ; i++) {            
            int temp = arr[i] % k;
            if(temp < 0) temp = k + temp;
            int need = (k - temp) % k;
            if(candid[need] != 0) {
                candid[need]--;
            } else {
                candid[temp]++;
            }
        }

        for(int i = 0 ; i < k ; i ++) {
            if(candid[i] != 0) return false;
        }

        return true;
    }
}