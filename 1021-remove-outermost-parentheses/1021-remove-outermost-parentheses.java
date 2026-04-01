class Solution {
    public String removeOuterParentheses(String s) {
        char[] arr=s.toCharArray();
        int l=0,r=0,ini=0;
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                l++;
            }
            else{
                r++;
            }
            if(l-r==0){
                l=0;
                r=0;
                for(int j=ini+1;j<i;j++){
                    ans.append(arr[j]);
                }
                ini=i+1;

            }
        }
        String stringAns = ans.toString();
        return stringAns;
    }
}