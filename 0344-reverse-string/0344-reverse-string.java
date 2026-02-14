class Solution {
    public void reverseString(char[] s) {
        int l=s.length -1;
        int f=0;
        for(int i=0;i<(s.length/2);i++){
            char c=s[l];
            s[l]=s[i];
            s[i]=c;
            l--;
            f++;
        }
    }
}