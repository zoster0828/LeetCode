class Solution {
    public String clearDigits(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        Stack<Integer> stack = new Stack();
        for(int i = 0 ; i < n ; i++) {
            if(chars[i]-48 < 10) {
                chars[i] = '\0';
                chars[stack.pop()] = '\0';
            } else {
                stack.add(i);
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < n ; i++) {
            if(chars[i] != '\0') {
                builder.append(chars[i]);
            }
        }

        return builder.toString();
    }
}