package graph.cycle;

import java.util.ArrayList;

public class DetectCycleDirectedGraph {


    /*Complete the function below*/

    class Solution {
        // Function to detect cycle in a directed graph.
        public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
            // code here
            int[] visited = new int[V];
            int[] pathVisited = new int[V];
            for(int src=0; src<V; src++){
                if(visited[src] == 0){
                    if(hasCycle(src, adj, visited, pathVisited)==true) return true;
                }
            }
            return false;
        }
        public boolean hasCycle(int src, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] pathVisited){
            visited[src] = 1;
            pathVisited[src] = 1;
            for(int neighb: adj.get(src)){
                if(visited[neighb] == 0){
                    if(hasCycle(neighb, adj, visited, pathVisited) == true) return true;
                }
                else if(pathVisited[neighb]==1){
                    return true;
                }
            }
            pathVisited[src] = 0;
            return false;
        }
    }
}
