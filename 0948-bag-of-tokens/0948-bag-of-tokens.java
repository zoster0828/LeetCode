class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {        
        Arrays.sort(tokens);
        if(tokens.length == 0 || tokens[0] > power) {
            return 0;
        }       
        power -= tokens[0];
        
        int left = 1;
        int right = tokens.length - 1;
        int result = 1;
        while(left <= right) {
            if(tokens[left] > power) {
                if(left == right) {
                    right --;
                    continue;
                }
                power += tokens[right];
                right--;
                result--;
            } else {                
                power -= tokens[left];
                left++;
                result++;
            }
        }
        
        return result < 0 ? 0 : result;
    }
}