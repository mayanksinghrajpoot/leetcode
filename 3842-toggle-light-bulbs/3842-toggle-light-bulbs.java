import java.util.*;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        // Since bulb IDs are between 1 and 100, a boolean array of size 101 works.
        // Initially, all values are false (bulbs are OFF).
        boolean[] isOn = new boolean[101];

        // Process each toggle request from the List
        for (int b : bulbs) {
            isOn[b] = !isOn[b];
        }

        // Collect bulbs that are ON in ascending order
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (isOn[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
