package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    int color;
    int parent;

    Node(int val, int color, int parent) {
        this.val = val;
        this.color = color;
        this.parent = parent;
    }
}

public class BipartiteGraph {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        Node[] nodes = new Node[V];
        // Code here
        for (int src = 0; src < V; src++) {
            //src is not visited and if for any component it is not bipartite, return false
            if (nodes[src] == null && !bfsIsBipartite(src, V, nodes, adj)) {
                return false;
            }
        }
        return true;
    }

    public boolean bfsIsBipartite(int src, int V, Node[] nodes, ArrayList<ArrayList<Integer>> adj) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(src, 1, -1)); // Add the source node in the q
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            for (int neighb : adj.get(curNode.val)) {
                if (nodes[neighb] == null) { //Not visited
                    int neighborColor = curNode.color == 1 ? 2 : 1;
                    nodes[neighb] = new Node(neighb, neighborColor, curNode.val); //Fill something at neighb index, which also means it is visited
                    q.add(nodes[neighb]);
                }// If neighbor has been visited and has the same color as current node's color
                else if (curNode.val != nodes[neighb].parent && curNode.color == nodes[neighb].color) {
                    return false;
                }
            }
        }
        return true;
    }
}
