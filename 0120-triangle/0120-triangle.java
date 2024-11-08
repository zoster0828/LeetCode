class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;   
        int n = triangle.size();

        for(int i = n-2 ; i >= 0 ; i--) {            
            List<Integer> floor = triangle.get(i);                        
            int m = floor.size();
            for(int j = 0 ; j < m ; j++) {
                int me = floor.get(j);
                floor.set(j, me + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }

        return triangle.get(0).get(0);
    }
}