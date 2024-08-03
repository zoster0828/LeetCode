class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean exists[] = new boolean[1001];
        for(int i : target) {
            exists[i] = true;
        }

        for(int i : arr) {
            if(exists[i]) continue;
            else return false;
        }

        return true;
    }
}