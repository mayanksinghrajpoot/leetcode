class Solution {
    public void recur(char[] s,int i,int j){
        while(i<j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;}
        return;
    }
    public void reverseString(char[] s) {
        recur(s,0,s.length-1);
    }
}
// class Solution {
//     public void reverseString(char[] s) {
//         int l=s.length -1;
//         int f=0;
//         for(int i=0;i<(s.length/2);i++){
//             char c=s[l];
//             s[l]=s[i];
//             s[i]=c;
//             l--;
//             f++;
//         }
//     }
// }