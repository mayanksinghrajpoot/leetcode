class Solution {
    record point(int x,int y){}
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans=new int[mat.length][mat[0].length];
        Queue<point>q=new LinkedList<>();
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    ans[i][j]=0;
                    q.offer(new point(i,j));
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }

        int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            point p=q.poll();
            int a=p.x();
            int b=p.y();
            for(int[] arr:dir){
                int ex=a+arr[0];
                int ey=b+arr[1];
                if(ex>=0 && ex<mat.length && ey>=0 && ey<mat[0].length && ans[ex][ey]==-1){
                    ans[ex][ey]=1+ans[a][b];
                    q.offer(new point(ex,ey));
                }
            }
        }

        return ans;


    }
}