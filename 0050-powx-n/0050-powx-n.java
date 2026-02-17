class Solution {
    public double myPow(double x, int n) {
        // Handle negative exponent
        long N = n; // Use long to prevent overflow when n = Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;
        double currentProduct = x;

        // Binary Exponentiation
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result = result * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
        }

        return result;
    }
}
