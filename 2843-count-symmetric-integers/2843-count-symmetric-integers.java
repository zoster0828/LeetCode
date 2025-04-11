class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for(int i = low ; i <= high ; i++) {
            if(isThat(i)) {
                result++;
            }
        }

        return result;
    }

    private boolean isThat(int i) {
        String s = String.valueOf(i);
        if(s.length()%2 != 0) {
            return false;
        }

        char[] charArray = s.toCharArray();
        int n = charArray.length / 2;

        int front = 0;
        int back = 0;
        for (int j = 0; j < n; j++) {
            front += (int) charArray[j];
            back += (int) charArray[j + n];
        }

        return front == back;
    }
}