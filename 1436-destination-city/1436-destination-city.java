class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> tour = new HashMap();
        for(List<String> path : paths) {
            tour.put(path.get(0), path.get(1));
        }
        
        String dest = paths.get(0).get(0);
        while(tour.containsKey(dest)) {
            dest = tour.get(dest);
        }
               
        return dest;
    }
}