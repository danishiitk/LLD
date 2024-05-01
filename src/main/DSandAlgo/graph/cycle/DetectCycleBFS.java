package graph.cycle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleBFS {
    public boolean hasCycle(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited = new boolean[V];
        int[] parentOf = new int[V];
        Arrays.fill(parentOf, -1);
        //Consider each vertex as starting point since unconnected components possible
        for(int s=0; s<V; s++){ //src is the starting node for each bfs traversal
            //Only start from vertex which has already not been visited in any bfs traversal,
            //since 1 bfs traversal will cover all nodes of a component so start from unvisited
            //vertex to consider all components
            if(!visited[s]) {
                //BFS starting from s as source node
                visited[s] = true;
                Queue<Integer> q = new LinkedList<>();
                q.add(s);
                while (!q.isEmpty()) {
                    int curVertex = q.poll();
                    //Visit each neighbor of the current node
                    for (int neighb : adj.get(curVertex)) {
                        if (!visited[neighb]){
                            q.add(neighb);
                            visited[neighb] = true; //Mark the neighbor as visited
                            parentOf[neighb] = curVertex; //Store the parent of the neighbor
                        } else if(neighb != parentOf[curVertex]){
                            // If the neighbor is visited, and it's not the parent of the current vertex,
                            // then a cycle exists.
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
