class Solution {
    public static String UP = "../";
    public static String CURRENT = "./";    

    public int minOperations(String[] logs) {
        int depth = 0;

        for(String log : logs) {
            if(log.equals(UP)) {
                depth -= 1;
                if(depth < 0) depth = 0;

                continue;
            } 

            if(log.equals(CURRENT)) {continue;}

            depth++;
        }

        return depth;
    }
}