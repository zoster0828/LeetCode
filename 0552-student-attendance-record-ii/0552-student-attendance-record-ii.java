class Solution {
    Long arrays[][][];
    int mod = 1000000007;

    public int checkRecord(int n) {
        arrays = new Long[n + 1][3][4];
        return (int) (get(n, 0, 0) % mod);
    }

    long get(int n, int absolute, int late) {
        if (absolute >= 2 || late >= 3) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if (arrays[n][absolute][late] != null) {
            return arrays[n][absolute][late];
        }
        long ans = 0;
        long p1 = get(n - 1, absolute + 1, 0) % mod;
        long p2 = get(n - 1, absolute, 0) % mod;
        long p3 = get(n - 1, absolute, late + 1) % mod;

        arrays[n][absolute][late] = ((p1 + p2 + p3) % mod);
        return arrays[n][absolute][late];
    }

}