class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> tour = new HashMap();
        for(List<String> path : paths) {
            tour.put(path.get(0), path.get(1));
        }
        
        for(Map.Entry<String, String> values : tour.entrySet()) {
            if(!tour.containsKey(values.getValue())) {
                return values.getValue();
            }
        }
               
        return "";
    }
}