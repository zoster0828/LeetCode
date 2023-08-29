class Solution {
    public int bestClosingTime(String customers) {  
        char[] chars = customers.toCharArray();
        int open = 0;
        for (char aChar : chars) {
            if(isOpened(aChar)) {
                open++;
            }
        }

        int minValue = open;
        int minValuePosition = 0;
        int[] values = new int[chars.length+1];
        values[0] = open;
        int closed = 0;
        for (int i = 0; i < chars.length; i++) {
            if(isOpened(chars[i])) {
                open--;
            } else {
                closed++;
            }
            values[i+1] = open+closed;

            if(values[i+1] < minValue) {
                minValue = values[i+1];
                minValuePosition = i+1;
            }
        }

        return minValuePosition;
    }

    private static boolean isOpened(char chars) {
        return chars == 'Y';
    }
}