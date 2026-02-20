class Solution {
    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        if (root * root != n || n == 1) return false;
        
        // Check if root is prime
        for (int i = 2; i * i <= root; i++) {
            if (root % i == 0) return false;
        }
        return true;
    }
}
