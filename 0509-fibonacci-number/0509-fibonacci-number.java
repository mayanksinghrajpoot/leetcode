class Solution {
    int solve(int n,ArrayList<Integer>dp){
        if(n<=1)return n;
        if(!dp.get(n).equals(-1))return dp.get(n);
        int result = solve(n-1,dp)+solve(n-2,dp);
        dp.set(n,result);
        return result;

    }
    public int fib(int n) {
        if(n==1 || n==0){
            return n;
        }
        ArrayList<Integer> dp =new ArrayList<>(Collections.nCopies(n+1,-1));
        return solve(n,dp);

    }
}