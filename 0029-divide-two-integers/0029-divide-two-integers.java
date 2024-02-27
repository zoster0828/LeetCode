class Solution {
    public int divide(int dividend, int divisor) {
        double result = (double)dividend / (double)divisor;
        return (int) (result > 0 ? Math.floor(result) : Math.ceil(result));
    }
}