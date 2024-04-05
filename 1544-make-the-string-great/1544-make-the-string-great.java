class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        int i = 1;
        while(i < s.length()) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                i++;
                continue;
            }
            int prev = stack.peek();
            if(Math.abs(((int)prev) - (int) s.charAt(i)) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            
            i++;
        }
        
        StringBuilder builder = new StringBuilder();
        while(!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        builder.reverse();
        return builder.toString();
    }
}