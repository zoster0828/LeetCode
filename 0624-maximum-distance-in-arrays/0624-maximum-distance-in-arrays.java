class Solution {
    public int maxDistance(List<List<Integer>> arrays) {        
        int minPo = -1;
        int maxPo = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arrays.size() ; i++) {
            List<Integer> array = arrays.get(i);
            if(min > array.get(0)) {
                minPo = i;
                min = array.get(0);
            }

            if(max < array.get(array.size()-1)) {
                maxPo = i;
                max = array.get(array.size()-1);
            }
        }

        if(minPo != maxPo) return max - min;

        int result = 0;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < arrays.size() ; i++) {
            if(minPo == i) continue;

            List<Integer> array = arrays.get(i);
            if(min2 > array.get(0)) {
                min2 = array.get(0);
            }

            if(max2 < array.get(array.size()-1)) {
                max2 = array.get(array.size()-1);
            }
        }

        return Math.max(max2-min, max - min2);
    }
}