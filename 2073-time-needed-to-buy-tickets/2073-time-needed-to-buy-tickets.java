class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int targetTickets = tickets[k];
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                // People at or before k buy at most tickets[k]
                time += Math.min(tickets[i], targetTickets);
            } else {
                // People after k buy at most tickets[k] - 1
                time += Math.min(tickets[i], targetTickets - 1);
            }
        }
        
        return time;
    }
}
