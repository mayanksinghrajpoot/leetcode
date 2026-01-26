class Solution {
    
    public List<List<Integer>> minimumAbsDifference(int[] a) {
        List<List<Integer>> nl = new ArrayList<>();
        Arrays.sort(a);
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