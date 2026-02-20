class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;
        
        int totalTime = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Add the smaller of: the gap to the next attack OR the full duration
            totalTime += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        
        // Always add the full duration for the last attack
        return totalTime + duration;
    }
}
