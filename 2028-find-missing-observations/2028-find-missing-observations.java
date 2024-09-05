class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] result = new int[n];

        int sum = 0;
        for(int num : rolls){
            sum += num;
        }

        int m = rolls.length;

        int target = (m+n) * mean;

        int necc = target - sum;

        if(necc < n || necc > n*6) return new int[0];

        int di = necc / n;
        int val = necc % n;
        for(int i = 0 ; i < n ; i++){
            if(val > 0)
                result[i] = di + 1;
            else
                result[i] = di;
            val --;
        }
//        int di = necc / n;
//        for(int i = 0 ; i < n ; i++){
//            result[i] = di;
//            necc -= di;
//            if(necc == 0) break;
//            di = necc / (n -i -1);
//        }

        return result;
    }
}