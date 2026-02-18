import java.util.*;

class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> parts = new ArrayList<>();
        int p = 1; // Current power of 10

        // Extract each digit and its base-10 value from right to left
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                parts.add(digit * p);
            }
            n /= 10;
            p *= 10;
        }

        // Reverse to ensure descending order (e.g., [500, 30, 7])
        Collections.reverse(parts);

        // Convert List to required int array
        int[] result = new int[parts.size()];
        for (int i = 0; i < parts.size(); i++) {
            result[i] = parts.get(i);
        }
        return result;
    }
}
