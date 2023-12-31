class Solution {
    public int candy(int[] ratings) {
        int[] values = new int[ratings.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        for (int i = 0; i < ratings.length-1; i++) {
            if(ratings[i] < ratings[i+1]) {
                values[i+1] = values[i]+1;
            }
        }

        for (int i = ratings.length -1 ; i > 0 ; i--) {
            if(ratings[i] < ratings[i-1] && values[i-1] <= values[i]) {
                values[i-1] = values[i]+1;
            }
        }

        return Arrays.stream(values).sum();
    }
}