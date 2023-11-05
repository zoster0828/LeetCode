class Solution {
    public int getWinner(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList();
        for(int i = 1 ; i < arr.length ; i++) {
            queue.add(arr[i]);
        }
        int init = arr[1];
        boolean first = true;
        int champ = arr[0];
        int consecutive = 0;
        while(true) {            
            int contender = queue.poll();            
            if(init == contender && !first) {
                return champ;
            }
            
            if(first) {first = false;} 
            
            if(champ > contender) {
                queue.add(contender);
                consecutive++;                
            } else {
                queue.add(champ);
                champ = contender;
                consecutive = 1;
            }
            
            if(consecutive == k) {
                return champ;
            }
        }
    }
}