class Solution {
    public int appendCharacters(String s, String t) {
        int sIdx = 0, tIdx = 0;
        int sLen = s.length(), tLen = t.length();

        // Greedily match characters of t in s
        while (sIdx < sLen && tIdx < tLen) {
            if (s.charAt(sIdx) == t.charAt(tIdx)) {
                tIdx++; // Found a match, move to the next character in t
            }
            sIdx++; // Always move to the next character in s
        }

        // Characters remaining in t must be appended to the end of s
        return tLen - tIdx;
    }
}
