class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int row = wall.get(0).stream().mapToInt(i -> i).sum();

        Map<Integer, Integer> map = new HashMap();

        for(List<Integer> list : wall) {
            int po = 0;
            for(int block : list) {
                po += block;
                map.put((po), map.getOrDefault((po), 0) + 1);
            }
        }


        int n = wall.size();
        if(map.keySet().size() == 1) return n;
        int max = Integer.MIN_VALUE;
        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()) {
            int key = itr.next();
            if(key == row) continue;

            int value = map.get(key);
            max = Math.max(value, max);
        }

        return n-max;
    }
}