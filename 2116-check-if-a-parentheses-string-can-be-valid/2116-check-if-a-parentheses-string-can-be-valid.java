class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;
        int minOpen = 0, maxOpen = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    minOpen++;
                    maxOpen++;
                } else {
                    minOpen--;
                    maxOpen--;
                }
            } else {
                minOpen--;
                maxOpen++;
            }
            if (maxOpen < 0) return false;
            if (minOpen < 0) minOpen = 0;
        }
        if (minOpen != 0) return false;
        minOpen = 0;
        maxOpen = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == ')') {
                    minOpen++;
                    maxOpen++;
                } else {
                    minOpen--;
                    maxOpen--;
                }
            } else {
                minOpen--;
                maxOpen++;
            }
            if (maxOpen < 0) return false;
            if (minOpen < 0) minOpen = 0;
        }
        return minOpen == 0;
    }
}
