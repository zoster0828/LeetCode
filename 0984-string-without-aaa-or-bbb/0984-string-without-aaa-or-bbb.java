class Solution {
    public String strWithout3a3b(int a, int b) {
            StringBuilder result = new StringBuilder();
    char charA = 'a', charB = 'b';
    int countA = 0, countB = 0;

    if (b > a) {
        int tempCount = a;
        a = b;
        b = tempCount;

        char tempChar = charA;
        charA = charB;
        charB = tempChar;
    }

    while (a > 0 || b > 0) {
        // Append 'a' if remaining 'a' count is greater than 'b' count and consecutive 'a's are less than 2
        if (a > b && countA < 2) {
            result.append(charA);
            countA++;
            countB = 0;
            a--;
        }
        // Append 'b' if remaining 'b' count is greater than 0 and consecutive 'b's are less than 2
        else if (b > 0 && countB < 2) {
            result.append(charB);
            countB++;
            countA = 0;
            b--;
        }

        // Swap characters if 'b' count is greater than 'a' count
        if (b > a) {
            int tempCount = a;
            a = b;
            b = tempCount;

            char tempChar = charA;
            charA = charB;
            charB = tempChar;
        }
    }

    return result.toString();
    }
    
    String one(int count, String start) {
        String result = "";
        String add = "";
        if(start == "a") {
            add = "ba";
        } else {
            add = "ab";
        }
        for(int i = 0 ; i < count ; i++) {
            result += add;
        }
        
        return result;
    }
}