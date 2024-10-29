class Solution {    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        int n = chars.length;
        for(int i = 0 ; i <  n ; i++) {
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if(stack.size() == 0) return false;
                
                char c = stack.pop();
                if(chars[i] == ')' && c != '(') return false;
                if(chars[i] == ']' && c != '[') return false;
                if(chars[i] == '}' && c != '{') return false;                
            }
        }

        if(stack.size() != 0) return false;

        return true;
    }
}