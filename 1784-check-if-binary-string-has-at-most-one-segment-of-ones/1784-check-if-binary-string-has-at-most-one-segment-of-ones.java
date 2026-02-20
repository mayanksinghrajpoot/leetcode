class Solution {
    public boolean checkOnesSegment(String s) {
        // Since the string starts with '1', any second segment 
        // must be preceded by at least one '0'.
        return !s.contains("01");
    }
}
