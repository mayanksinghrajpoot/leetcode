class Solution {
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length(); i++) {
            // If we find a '1' that follows a '0', 
            // a new segment of ones has started.
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}
