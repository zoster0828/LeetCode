class Solution {
    public int maxDiff(int num) {                   
        String max = String.valueOf(num);
        String min = String.valueOf(num);

        int reserved[] = new int[10];        
        Arrays.fill(reserved, -1);
        
        
        int count = 2;
        int digit = Character.getNumericValue(max.charAt(0));
        boolean use = true;
        if(digit == 9) {
            min = min.replace('9','1');
        } else if(digit == 1) {
            max = max.replace('1','9');
            use = false;
        } else {
            char ch = (char) (digit + '0');
            min = min.replace(ch,'1');
            max = max.replace(ch,'9');
            return Integer.parseInt(max) - Integer.parseInt(min);
        }

        if(num >= 10) {            
            for(int i = 1; i < max.length() ; i++) {
                if(use)
                    digit = Character.getNumericValue(max.charAt(i));
                else 
                    digit = Character.getNumericValue(min.charAt(i));
                if(
                    (use && digit == 9) 
                    || 
                    (!use && digit ==0)
                ) {continue;}
                char ch = (char) (digit + '0');
                if(use) {
                    max = max.replace(ch,'9');                    
                } else {
                    if(min.charAt(0) == ch) continue;
                    min = min.replace(ch,'0');                
                }
                break;
            }            
        }
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}