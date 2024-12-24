import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int[] indeg = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        
        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            graph[pre].add(course);
            indeg[course]++;
        }

       
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                queue.add(i);
            }
        }

       
        int[] order = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            order[index++] = curr;

            
            for (int neighbor : graph[curr]) {
                indeg[neighbor]--;
                if (indeg[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        
        if (index != numCourses) {
            return new int[0];
        }

        return order;
    }
}
