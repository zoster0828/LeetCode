class Solution {
    public String interpret(String command) {
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < command.length() ; i++) {
            char c = command.charAt(i);
                        
            
            if(c == 'G') {
                result.append(c);
                continue;
            }
            
            temp.append(c);
            
            if(c == ')') {
                
                String tempStr = temp.toString();
                if(tempStr.equals("()")) {
                    result.append('o');
                }
                
                if(tempStr.equals("(al)")) {
                    result.append("al");
                }
                
                temp = new StringBuilder();
            }
        }
        
        return result.toString();
    }
}