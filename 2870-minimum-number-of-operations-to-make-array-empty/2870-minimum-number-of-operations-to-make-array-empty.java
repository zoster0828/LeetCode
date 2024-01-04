class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        int result = 0;
        
        for(Map.Entry<Integer, Integer> v : map.entrySet()) {
            int value = v.getValue();
            
            if(value == 1) {
                return -1;
            }
            
            result += calc(value, 0);
        }
        
        return result;
    }
    
    int calc(int num, int result) {
        if(num == 0) {return result;}
        if(num == 1 || num == 2 || num == 3) {result ++;return result;} 
        if(num == 4)  {result +=2;return result;}
        return calc(num%3, result+(num/3));
    }
}