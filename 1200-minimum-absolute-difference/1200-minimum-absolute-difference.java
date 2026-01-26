class Solution {
    static void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        // recursive calls (still same function)
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);

        // merge step (written directly here)
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        // copy back
        for (i = 0; i < temp.length; i++) {
            a[left + i] = temp[i];
        }
    }
    public List<List<Integer>> minimumAbsDifference(int[] a) {
        List<List<Integer>> nl = new ArrayList<>();
        mergeSort(a, 0, a.length - 1);
        
        int min=a[1]-a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]<min){
                min=a[i+1]-a[i];
            }
        }
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]==min){
                nl.add(new ArrayList<>(Arrays.asList(a[i],a[i+1])));
            }
        }
        return nl;

    }
}