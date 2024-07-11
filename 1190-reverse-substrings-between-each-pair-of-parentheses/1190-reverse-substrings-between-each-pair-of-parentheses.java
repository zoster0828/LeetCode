class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> levels = new ArrayDeque<>();
        levels.push(new StringBuilder());  // level 0
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                // add level on '('
                levels.push(new StringBuilder());
            } else if (ch == ')') {
                // reverse deeper level and append to current level on ')'
                StringBuilder deeperLevel = levels.pop().reverse();
                levels.peek().append(deeperLevel);
            } else {
                // simply append chars to current level
                levels.peek().append(ch);
            }
        }
        return levels.pop().toString();
    }
}