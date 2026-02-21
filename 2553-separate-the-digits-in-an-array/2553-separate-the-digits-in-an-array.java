import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            String s = String.valueOf(num);
            for (char c : s.toCharArray()) {
                list.add(c - '0'); // Convert char '1' to int 1
            }
        }
        
        // Convert List back to required primitive int[] array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
