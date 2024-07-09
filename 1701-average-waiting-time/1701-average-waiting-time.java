class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prev = customers[0][0];
        double result = 0;
        for(int customer[] : customers) {
            prev = customer[0] > prev ? customer[0] : prev;
            prev = (prev + customer[1]);
            result += prev - customer[0];
            
        }

        return result / customers.length;
    }
}