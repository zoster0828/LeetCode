class Solution {
    public static String UP = "../";
    public static String CURRENT = "./";    

    public int minOperations(String[] logs) {
        int depth = 0;

        for(String log : logs) {
            if(log.equals(UP)) {
                depth = Math.max(0, depth-1);
                continue;
            } 

            if(log.equals(CURRENT)) {
                continue;
            }

            depth++;
        }

        return depth;
    }
}