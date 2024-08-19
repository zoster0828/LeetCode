class Solution {    
    public int minSteps(int n) {
        if(n==1) return 0;
        if(n < 6) return n;

        for(int i : new int[]{2,3,5,7,11,13,17,23,43}) {
            if(n % i == 0) {
                return i + minSteps(n/i);
            }
        }

        return n;
    }
}   