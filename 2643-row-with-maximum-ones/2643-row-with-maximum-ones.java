class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int l=0,c=0;
        for(int i=0;i<mat.length;i++){
            int tempc=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    tempc++;
                }
            }
            if(tempc>c){
                c=tempc;
                l=i;
            }
        }
        return new int[]{l,c};
    }
}