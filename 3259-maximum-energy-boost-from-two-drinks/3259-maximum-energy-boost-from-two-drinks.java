class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        long[] dpA = new long[n];
        long[] dpB = new long[n];

        dpA[0] = energyDrinkA[0];
        dpB[0] = energyDrinkB[0];

        for (int i = 1; i < n; i++) {
            dpA[i] = Math.max(dpA[i - 1] + energyDrinkA[i], i > 1 ? dpB[i - 2] + energyDrinkA[i] : energyDrinkA[i]);
            dpB[i] = Math.max(dpB[i - 1] + energyDrinkB[i], i > 1 ? dpA[i - 2] + energyDrinkB[i] : energyDrinkB[i]);
        }

        return Math.max(dpA[n - 1], dpB[n - 1]);
    }
}