class Solution {
    public boolean checkIfExist(int[] arr) {
        int n =  arr.length;
        Set<Integer> set = new HashSet();
        int zero = 0;
        for(int i = 0 ; i < n ; i++) {
            set.add(arr[i]);
            if(arr[i] == 0) zero++;
        }

        for(int i = 0 ; i < n ; i++) {
            if(arr[i]==0 && zero == 1) continue;
            if(set.contains(arr[i]*2)) return true;
        }

        return false;
    }
}