class Solution {
    public int nthUglyNumber(int n) {                
        PriorityQueue<Long> queue = new PriorityQueue();        
        queue.add(1L);
        int count = 0;
        Long result = -1L;
        Set<Long> checked = new HashSet();
        while(count++ < n) {            
            result = queue.poll();
            for(int multi : new int[]{2,3,5}){
                if(!checked.contains(result * multi)){
                    queue.add(result * multi);
                    checked.add(result * multi);
                }
            }
                
        }

        return result.intValue();
    }
}