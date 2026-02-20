class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if a common divisor string exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Step 2: Find GCD of the two lengths
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Step 3: The result is the substring from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD of two numbers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
