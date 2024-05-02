package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Only for DAG --> Directed Acyclic graph
//Calculate in degree of all vertices, store in an array, add all 0 in degree vertices in the q
//Visit and decrease the in degree, if any vertex has 0 in degree add it in the q
public class TopologicalSort {
    /*Complete the function below*/
    //Function to return list containing vertices in Topological order.
    public int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        //Find in degrees of each vertex and store in an array
        int[] inDegree = new int[V];
        for (int v = 0; v < V; v++) {
            for (int neighb : adj.get(v)) {
                inDegree[neighb] += 1;
            }
        }
        //q for bfs
        Queue<Integer> q = new LinkedList<>();
        //Add all 0 inDegree nodes, since can put them at the beginning of topo sort ans
        for (int v = 0; v < V; v++) {
            if (inDegree[v] == 0) q.add(v);
        }
        int[] ans = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            ans[i++] = cur; //q contains nodes which have 0 in degree
            for (int neighb : adj.get(cur)) {
                inDegree[neighb] -= 1;
                if (inDegree[neighb] == 0) {
                    q.add(neighb);
                }
            }
        }
        return ans;
    }
}
