class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int result = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            Character candidate = s.charAt(i);
            if(candidate == '(') depth++;
            if(candidate == ')') depth--;
            
            if(depth > result) result = depth;
        }
        
        return result;
    }
}