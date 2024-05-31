class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int[] results = new int[2];
        int resultPo = 0;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                results[resultPo] = entry.getKey();
                resultPo++;
                if(resultPo == 2) break;
            }
        }
        
        return results;
    }
}