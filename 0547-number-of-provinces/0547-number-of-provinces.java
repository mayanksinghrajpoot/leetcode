class Solution {
    public ArrayList<ArrayList<Integer>> matrixtolist(int[][] mat){
        int v=mat.length;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int u=mat[0].length;
        for(int i=0;i<v;i++){
                list.add(new ArrayList<>());
                
                    for(int j=0;j<u;j++){
                        if(mat[i][j]==1){
                            list.get(i).add(j);
                        }
                    }
                
        }
        return list;
    }

    public void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> list){
        visited[node]=true;
        for(int neighbour:list.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,visited,list);
            }
        }
        return ;
    }

    public int countProvinces(ArrayList<ArrayList<Integer>> list){
        int count=0;
        int v=list.size();
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visited[i]){
                count++;
                dfs(i,visited,list);
            }
        }

        return count;
    }

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list=matrixtolist(isConnected);
        int nOfProvinces= countProvinces(list);
        return nOfProvinces;
    }
}