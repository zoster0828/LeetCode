class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prev = customers[0][0];
        double result = 0;
        for(int i = 0 ; i < customers.length ; i++) {
            prev = customers[i][0] > prev ? customers[i][0] : prev;

            result += (prev + customers[i][1]) - customers[i][0];
            prev = (prev + customers[i][1]);
        }

        return result / customers.length;
    }
}