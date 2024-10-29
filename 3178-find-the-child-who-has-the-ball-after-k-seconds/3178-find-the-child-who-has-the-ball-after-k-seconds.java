class Solution {
    public int numberOfChild(int n, int k) {        
        int remainder = (k) % (n + (n-2));
        if(remainder < n) {
            return remainder;
        } else {
            return remainder - n + 1;
        }
    }
}