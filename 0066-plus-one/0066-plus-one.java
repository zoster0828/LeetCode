class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
                if(i == 0){
                    digits = new int[digits.length + 1];
                    digits[0] = 1;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }

        return digits;
    }
}