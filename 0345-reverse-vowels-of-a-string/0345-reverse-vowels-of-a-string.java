class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(int i = 0 ; i < c.length  ; i++) {
            if(isVowel(c[i])) {
                stack.push(c[i]);
            }
        }
        
        
        for(int i = 0 ; i < c.length  ; i++) {
            if(isVowel(c[i])) {
                c[i] = stack.pop();
            } 
        }

        return new String(c);
    }

    public boolean isVowel(char c) {
        if(c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {return true;}
        else return false;
    }
}