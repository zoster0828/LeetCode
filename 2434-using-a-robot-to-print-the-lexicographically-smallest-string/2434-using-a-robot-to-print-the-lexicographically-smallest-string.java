class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] rightMin = new char[n];
        rightMin[n - 1] = s.charAt(n - 1);
        // right smallest character array
        // so we can find at any index if we have smaller value yet to come
        for (int i = n - 2; i >= 0; i--)
            rightMin[i] = s.charAt(i) < rightMin[i + 1] ? s.charAt(i) : rightMin[i + 1];

        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            while (!stack.isEmpty() && stack.peek() <= curr && rightMin[i] >= stack.peek())
                ans.append(stack.pop());

            stack.push(curr);
        }
        while(!stack.isEmpty())
            ans.append(stack.pop());
        
        return ans.toString();

    }
}