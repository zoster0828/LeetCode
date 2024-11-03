class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m) return false;

        int po1 = 0;

        while(po1++ < n) {
            for(int i = 0 ; i < n ; i++){
                if(s.charAt((i+po1) % n) != goal.charAt(i)) {
                    break;
                }

                if(i == n-1) return true;
            }
        }

        return false;
    }
}