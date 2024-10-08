class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int candid[] = new int[k];

        int invalid = 0;
        for(int i = 0 ; i < n ; i++) {            
            int temp = arr[i] % k;
            if(temp < 0) temp = k + temp;
            int need = (k - temp) % k;
                        
            if(candid[need] != 0) {
                candid[need]--;
                invalid--;
            } else {
                candid[temp]++;
                invalid++;
                if(invalid > (n-i)) return false;
            }
        }

        return invalid == 0;
    }
}