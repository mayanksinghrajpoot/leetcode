class Solution {
    public int removeElement(int[] num, int val) {
        int c=0;
        int f=0;
        while(f<num.length){
            if(num[c]==val){
                if(num[f]==val){
                    f++;
                }else{
                    num[c]=num[f];
                    num[f]=val;
                    f++;
                    c++;
                }
            }
            else{
                c++;
                f++;
            }
        }
        return c;
    }
}