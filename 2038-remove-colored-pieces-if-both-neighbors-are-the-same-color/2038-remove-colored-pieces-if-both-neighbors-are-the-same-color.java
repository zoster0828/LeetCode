class Solution {
    public boolean winnerOfGame(String colors) {
        int Acount = 0;
        int Bcount = 0;
        char[] chars = colors.toCharArray();

        int continuous = 0;
        char prev = 'C';
        for(int i = 0 ; i <= chars.length ; i ++) {
            if(i != chars.length && prev == chars[i]) {
                continuous++;
            } else {
                if(prev == 'A') {
                    Acount += getScore(continuous);
                } else if(prev == 'B') {
                    Bcount += getScore(continuous);
                }

                if(i != chars.length) {
                    prev = chars[i];
                }
                continuous = 1;
            }
        }

        return Acount > Bcount;
    }

    private int getScore(int continuous) {
        if(continuous < 3) {
            return 0;
        } else {
            return continuous - 2;
        }
    }
}