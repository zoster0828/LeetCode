class Solution {
    public int maximumSwap(int num) {
        char[] numArray = String.valueOf(num).toCharArray();
        char[] rs = new char[numArray.length];
        char maxDigit = '0';
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = numArray.length - 1; i >= 0; i--) {
            if (numArray[i] > maxDigit) {
                maxDigit = numArray[i];
                mp.put(maxDigit, i);
            }
            rs[i] = maxDigit;
        }

        for (int i = 0; i < numArray.length; i++) {
            if (rs[i] > numArray[i]) {
                char temp = numArray[i];
                numArray[i] = rs[i];
                numArray[mp.get(rs[i])] = temp;
                break;
            }
        }

        return Integer.parseInt(new String(numArray));
    }
}