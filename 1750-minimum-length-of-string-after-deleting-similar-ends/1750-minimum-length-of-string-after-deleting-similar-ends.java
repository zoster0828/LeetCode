class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            
            if(cl == cr) {
                char c = cl;
                
                left++;
                while(left < right && s.charAt(left) == c) {
                    left++;
                }
                
                right--;
                while(left < right && s.charAt(right) == c) {
                    right--;
                }
            } else {
                break;
            }
        }
        
        if(left > right) {
            return 0;
        }
        
        return s.substring(left, right+1).length();
    }
}