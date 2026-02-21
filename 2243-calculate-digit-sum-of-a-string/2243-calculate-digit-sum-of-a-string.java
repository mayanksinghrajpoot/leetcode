class Solution {
    public String digitSum(String s, int k) {
        // Continue as long as the string length is greater than k
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            
            // Process the string in chunks of size k
            for (int i = 0; i < s.length(); i += k) {
                // Get the substring of length k (or less for the final chunk)
                String group = s.substring(i, Math.min(i + k, s.length()));
                
                // Calculate the sum of digits in the current group
                int sum = 0;
                for (char c : group.toCharArray()) {
                    sum += c - '0';
                }
                
                // Append the sum to our new string builder
                sb.append(sum);
            }
            // Update s with the newly formed string
            s = sb.toString();
        }
        
        return s;
    }
}
