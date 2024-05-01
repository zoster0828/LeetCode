class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack();
        
        int i = 0;
        boolean notexists = true;
        for(; i < word.length() ; i++) {
            char c = word.charAt(i);
            stack.push(c);
            
            if(c == ch) {
                notexists = false;
                i++;
                break;
            }
        }
        
        if(notexists) return word;
        
        StringBuilder builder = new StringBuilder();
        
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        for(; i < word.length() ; i++) {
            char c = word.charAt(i);
            builder.append(c);
        }
        
        return builder.toString();
    }
}