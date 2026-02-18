import java.util.*;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        // Strings must be the same length to be buddies
        if (s.length() != goal.length()) return false;

        // Case 1: Strings are already equal
        if (s.equals(goal)) {
            // Check if there's at least one duplicate character to swap
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) return true;
                set.add(c);
            }
            return false;
        }

        // Case 2: Strings are different
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndices.add(i);
            }
        }

        // Must have exactly 2 differences, and swapping them must match 'goal'
        return diffIndices.size() == 2 &&
               s.charAt(diffIndices.get(0)) == goal.charAt(diffIndices.get(1)) &&
               s.charAt(diffIndices.get(1)) == goal.charAt(diffIndices.get(0));
    }
}
