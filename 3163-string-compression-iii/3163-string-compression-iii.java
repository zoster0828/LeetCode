class Solution {
    public String compressedString(String word) {        
        char[] chars = word.toCharArray();
        int n = chars.length;
        int stack = 0;
        char prev = '-';
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < n ; i++) {
            if(prev == chars[i]) {
                if(stack == 9) {
                    result.append(stack);
                    result.append(prev);
                    stack = 1;
                    continue;
                }

                stack++;
            } else {
                if(stack != 0) {
                    result.append(stack);
                    result.append(prev);
                    stack = 1;
                } else {
                    stack = 1;
                }

                prev = chars[i];
            }
        }

        result.append(stack);
        result.append(prev);

        return result.toString();
    }
}