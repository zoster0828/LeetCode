class Solution {
    public String convertToTitle(int columnNumber) {        
        if (columnNumber < 27) {
            return Character.toString((char) ('A' + (columnNumber - 1) % 26));
        }

        StringBuilder c = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber % 26 == 0) {
                c.append((char) ('A' + 25));
                columnNumber -= 1;
            } else {
                c.append((char) ('A' + columnNumber % 26 - 1));
            }
            columnNumber /= 26;
        }
        return c.reverse().toString();
    }
}