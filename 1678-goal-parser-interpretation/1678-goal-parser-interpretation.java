class Solution {
    public String interpret(String command) {
        Stack<Character> stack = new Stack();
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < command.length() ; i++) {
            char c = command.charAt(i);
                        
            
            if(c == 'G') {
                result.append(c);
                continue;
            }
            
            stack.add(c);
            
            if(c == ')') {
                StringBuilder temp = new StringBuilder();
                while(!stack.empty()) {
                    temp.append(stack.pop());
                }
                
                String tempStr = temp.reverse().toString();
                if(tempStr.equals("()")) {
                    result.append('o');
                }
                
                if(tempStr.equals("(al)")) {
                    result.append("al");
                }
            }
        }
        
        return result.toString();
    }
}