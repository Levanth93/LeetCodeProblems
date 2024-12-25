class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        int[] indeg=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph[u].add(v);
            indeg[v]++;
        }

        boolean[] visited=new boolean[numCourses];
        int count =0;
        Queue<Integer> que =new LinkedList<>();
        

        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                que.add(i);
            }
        }

        while(que.size()>0){
            int rem=que.poll();
            count++;
            visited[rem]=true;
            for(int nbr:graph[rem]){
                if(visited[nbr]==false){
                    indeg[nbr]--;
                    if(indeg[nbr]==0){
                        que.add(nbr);
                    }
                }
            }
        }
        if(count==numCourses) return true;
        return false;
    }
}