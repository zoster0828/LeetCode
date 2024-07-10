class Solution {

    public int minOperations(String[] logs) {
        int depth = 0;

        for(String log : logs) {
            if(log.charAt(0) == '.') {
                if(log.charAt(1) == '.') {
                    depth = depth == 0 ? 0 : depth-1;
                    
                }
            } else {
                depth++;
            }
        }

        return depth;
    }
}