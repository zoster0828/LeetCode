class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        boolean[] checked = new boolean[dominoes.length];
        int next = 0;
        boolean change = true;
        for(int i = next ; i < dominoes.length - 1 ; i++) {
            if(checked[i]) {
                continue;
            }
            change = true;
            int now = 0;
            for(int j = i+1 ; j < dominoes.length ; j++) {
                if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) ||
                        (dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0])) {
                    now++;
                    checked[j] = true;
                } else {
                    if(change){
                        next = i;
                        change = false;
                    }
                }
            }
            if(now != 0){
                result += ((now+1)*now) / 2;
            }
        }




        return result;
    }
}