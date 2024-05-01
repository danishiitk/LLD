package graph.cycle;

import java.util.ArrayList;

public class DetectCycleDFS {
    public boolean hasCycle(ArrayList<Integer>[] adj, int V){
        boolean[] visited = new boolean[V];
        for(int src = 0; src<V; src++){
            if(!visited[src]){
                if(hasCycleUtil(adj, src,  -1, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean hasCycleUtil(ArrayList<Integer>[] adj, int curNode, int parent, boolean[] visited) {
        visited[curNode] = true;
        for(int child: adj[curNode]){
            if(!visited[child]) {
                if (hasCycleUtil(adj, child, curNode, visited))
                    return true;
            }
            else if(child != parent) //If child already visited and is not parent of curNode
                return true;
        }
        return false;
    }
}
