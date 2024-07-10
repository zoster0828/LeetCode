class Solution {

    public int minOperations(String[] logs) {
        int depth = 0;

        for(String log : logs) {
            if(log.charAt(0) == '.') {
                if(log.charAt(1) == '.') {
                    depth = Math.max(depth-1, 0);
                }
            } else {
                depth++;
            }
        }

        return depth;
    }
}