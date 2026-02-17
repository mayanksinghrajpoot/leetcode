import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Count frequencies in the first array
        for (String w : words1) {
            map1.put(w, map1.getOrDefault(w, 0) + 1);
        }

        // Count frequencies in the second array
        for (String w : words2) {
            map2.put(w, map2.getOrDefault(w, 0) + 1);
        }

        int count = 0;
        // Check words from the smaller map to be slightly more efficient
        for (String w : map1.keySet()) {
            // Must appear exactly once in BOTH maps
            if (map1.get(w) == 1 && map2.getOrDefault(w, 0) == 1) {
                count++;
            }
        }

        return count;
    }
}
