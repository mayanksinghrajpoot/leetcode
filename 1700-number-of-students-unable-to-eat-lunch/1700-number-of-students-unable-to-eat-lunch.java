class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2]; // counts[0] for circle, counts[1] for square
        for (int s : students) {
            counts[s]++;
        }

        for (int sandwich : sandwiches) {
            // If no student left wants the current sandwich, everyone else stays hungry
            if (counts[sandwich] == 0) {
                break;
            }
            counts[sandwich]--;
        }

        // The remaining students are the ones who couldn't eat
        return counts[0] + counts[1];
    }
}
