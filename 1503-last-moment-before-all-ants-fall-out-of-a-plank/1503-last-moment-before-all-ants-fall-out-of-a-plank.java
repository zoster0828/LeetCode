class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int rightmin = right.length == 0 ? 0 : n - right[0];
        int leftmin = left.length == 0 ? 0 : left[left.length-1];
        return Math.max(rightmin, leftmin);
    }
}