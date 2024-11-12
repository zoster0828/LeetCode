class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            if(c != ']') {
                stack.push(c);
            } else {
                StringBuilder builder = new StringBuilder();                
                StringBuilder count = new StringBuilder();                

                while(!stack.isEmpty() && Character.isAlphabetic(stack.peek())) {
                    builder.insert(0, stack.pop());            
                }

                stack.pop();

                while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    count.insert(0, stack.pop());
                }

                Integer loop = Integer.parseInt(count.toString());

                while(--loop >= 0) {
                    char[] chars = builder.toString().toCharArray();
                    for(char tt : chars) {
                        stack.push(tt);
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}