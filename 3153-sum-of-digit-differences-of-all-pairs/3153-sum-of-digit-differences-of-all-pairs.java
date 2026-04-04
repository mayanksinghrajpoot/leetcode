class Solution {
    public long sumDigitDifferences(int[] num) {
        long result=0;
        int n=num.length;
        long m=String.valueOf(Math.abs(num[0])).length();
        for(int i=0;i<m;i++){
            int[] arr=new int[10];
            long r=0;
            for(int j=0;j<n;j++){
                int d=(num[j]/((int) Math.pow(10, m-i-1)))%10;
                arr[d]++;
            }
            for(int j=0;j<10;j++){
                r+=(long) arr[j] * (n - arr[j]);
            }
            result+=r/2;
        }
        return result;
    }
}