class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        List<Integer>l=new ArrayList<>();
        int[] indegree=new int[n];

        for(int i=0;i<n;i++){
            for(int j:graph[i]){
                list.get(j).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            l.add(curr);
            for(int neighbour:list.get(curr)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        Collections.sort(l);
        return l;

        
    }
}