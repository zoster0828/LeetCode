class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            char cl = s.charAt(left);
            char cr = s.charAt(right);
            
            if(cl == cr) {
                char c = cl;
                
                do{left++;}
                while(left < right && s.charAt(left) == c);
                
                do{right--;}
                while(left < right && s.charAt(right) == c);
                    
            } else {
                break;
            }
        }
        
        return s.substring(left, right+1).length();
    }
}