class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList();
        for(int i = 0 ; i < n ; i ++) {
            list.add(i+1);
        }
        
        int curr = 0;
        while(list.size() > 1) {
            int next = (curr + k -1) % list.size();
            list.remove(next);
            curr = next;
        }
        
        return list.get(0);
    }
}