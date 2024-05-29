class Solution {
    public int numSteps(String s) {
        int count = 0;
        while(!s.equals("1")) {
            if(s.charAt(s.length()-1) ==  '1') {
                s = addOne(s);
            } else {
                s = divide(s);
            }
            
            count ++;
        }
        
        return count;
    }
    
    public static String addOne(String binary) {
        StringBuilder result = new StringBuilder();
        int carry = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int sum = carry;
            if (binary.charAt(i) == '1') {
                sum += 1;
            }

            if (sum == 2) {
                carry = 1;   
                result.append('0');
            } else {
                carry = 0;
                result.append(sum); 
            }
        }

        if (carry == 1) {
            result.append('1');
        }

        return result.reverse().toString();
    }
    
    public static String divide(String binary) {
        if (binary.length() <= 1) {
            return "0"; 
        }
        return binary.substring(0, binary.length() - 1);
    }

}