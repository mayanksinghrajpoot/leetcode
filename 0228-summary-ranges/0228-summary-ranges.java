class Solution {
    public List<String> summaryRanges(int[] arr) {
        List<String> l=new ArrayList<>();
        if(arr.length==0)return l;
        if(arr.length==1){l.add(""+arr[0]); return l;};
        int a=arr[0],p=arr[0];
        for (int i=1;i<arr.length;i++){
            if(p+1 != arr[i]){
                if(p!=a){
                    l.add(a+"->"+p);
                    a=arr[i];
                    p=arr[i];
                }
                else{
                    l.add(""+a);
                    a=arr[i];
                    p=arr[i];
                }
            }
            else{
                p++;
            }
            if(arr[i]==arr[arr.length-1]){
                if(p!=a){
                    l.add(a+"->"+p);
                }
                else{
                    l.add(""+a);
                }
            }
        }
        return l;
    }
}