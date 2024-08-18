class Solution {
    public int nthUglyNumber(int n) {                
        int num[] = new int[n];
        num[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for(int i = 1 ; i < n ; i++) {
            num[i] = Math.min(Math.min(num[i2]*2, num[i3]*3), num[i5]*5);
            if(num[i] == num[i2]*2) i2++;
            if(num[i] == num[i3]*3) i3++;
            if(num[i] == num[i5]*5) i5++;
        }

        return num[n-1];
    }
}