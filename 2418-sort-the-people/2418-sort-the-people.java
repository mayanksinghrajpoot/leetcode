import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        // Map each height to the person's name
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        // Sort the heights array (ascending by default)
        Arrays.sort(heights);

        // Build the result array in descending order
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            // Get the tallest remaining person from the end of the sorted array
            result[i] = map.get(heights[n - 1 - i]);
        }

        return result;
    }
}
