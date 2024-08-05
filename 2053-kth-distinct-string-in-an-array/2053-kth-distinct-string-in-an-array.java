class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> poMap = new HashMap();
        Map<String, Integer> dupMap = new HashMap();
        for(int i = 0 ; i < arr.length ; i++) {
            if(dupMap.containsKey(arr[i]))
                continue;
            if(poMap.containsKey(arr[i])) {
                dupMap.put(arr[i], 1);
                continue;
            }
                
            poMap.put(arr[i],i);            
        }        
        for(int i = 0 ; i < arr.length ; i++) {
            if(!dupMap.containsKey(arr[i])) {
                k--;
            }

            if(k == 0) {
                return arr[i];
            }
        }

        return "";
    }
}