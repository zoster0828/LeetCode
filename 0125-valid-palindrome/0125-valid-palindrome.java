class Solution {
    public boolean isPalindrome(String s) {     
        int left=0;
        int right= s.length()-1;
        char l,r;
        while(left<right){
            l= s.charAt(left);
            r= s.charAt(right);

            if(l>64 && l<91) l+=32;
            if(r>64 && r<91) r+=32;

            if(!((l > 96 && l < 123)|| (l > 47 && l < 58))) {left++; continue;}
            if(!((r > 96 && r < 123)|| (r > 47 && r < 58))) {right--; continue;}
            if(l!=r) return false;

            right--;
            left++;

        }
        return true;
    }
}