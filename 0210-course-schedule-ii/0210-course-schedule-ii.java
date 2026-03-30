class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] arr=new int[n];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        int[] indegree=new int[n];
        for(int[] p:prerequisites){
            int course=p[0];
            int prereq=p[1];
            list.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0,k=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            arr[k]=curr;
            k++;
            for(int neighbour:list.get(curr)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        if(count==n){
            return arr;
        }
        return new int[]{};
    }
}