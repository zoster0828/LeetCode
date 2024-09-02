class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int c : chalk) {
            sum += c;
        }

        long remain = k % sum;

        if(remain == 0) return 0;
        
        for(int i = 0 ; i < chalk.length ; i++) {
            remain -= chalk[i];
            if(remain < 0) {
                return i;
            }
        }

        return -1;
    }
}