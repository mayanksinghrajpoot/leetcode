class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<Integer>());
        }
        int[] indegree=new int[numCourses];
        for(int[] p:prerequisites){
            int course=p[0];
            int prereq=p[1];
            list.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            count++;
            int curr=q.poll();
            for(int neighbour:list.get(curr)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        return count==numCourses;
    }
}