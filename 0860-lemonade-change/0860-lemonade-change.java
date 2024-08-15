class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count = 0;
        int count2 = 0;
        
        for(int bill : bills) {
            if(bill == 5) count++;
            if(bill == 10) {
                count--;
                count2++;
            }
            if(bill == 20) {
                if(count2 != 0) {
                    count--;
                    count2--;
                } else {
                    count-=3;
                }
            }

            if(count < 0 || count2 < 0) return false;
        }

        return true;
    }
}