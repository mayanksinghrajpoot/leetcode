class Solution {
    public String largestGoodInteger(String num) {
        // Iterate from '9' down to '0' to find the largest triplet first
        for (int i = 9; i >= 0; i--) {
            // Create a string of three identical digits, e.g., "999", "888"...
            String triplet = String.valueOf(i).repeat(3);
            
            // If the triplet exists in the input string, return it immediately
            if (num.contains(triplet)) {
                return triplet;
            }
        }
        
        // Return an empty string if no "good integer" is found
        return "";
    }
}
