class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int[][] minmax = new int[arrays.size()][2];

        for(int[] m : minmax) {
            m[0] = Integer.MAX_VALUE;
            m[1] = Integer.MIN_VALUE;
        }

        for(int i = 0 ; i < arrays.size() ; i++) {
            List<Integer> array = arrays.get(i);
            for(int num : array) {
                minmax[i][0] = Math.min(minmax[i][0], num);
                minmax[i][1] = Math.max(minmax[i][1], num);
            }
        }

        int result = 0;
        int min = minmax[0][0];
        int max = minmax[0][1];
        for(int i = 1 ; i < minmax.length ; i++) {
            result = Math.max(Math.abs(minmax[i][0] - max), result);
            result = Math.max(Math.abs(minmax[i][1] - min), result);
            min = Math.min(minmax[i][0], min);
            max = Math.max(minmax[i][1], max);
        }

        return result;
    }
}