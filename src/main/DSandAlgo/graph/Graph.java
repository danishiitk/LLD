package graph;
import java.util.*;

class Graph {
    private int V; // Number of vertices
    private static LinkedList<Integer>[] adj; // Adjacency List

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // Undirected graph
    }
    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        //Check cycle using BFS
        //Construct the adj list, list of list
//        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
//        for(LinkedList<Integer> ll: adj){
//            adjList.add(new ArrayList<>(ll));
//        }
//       DetectCycleBFS detectCycleBFS = new DetectCycleBFS();
//        if(detectCycleBFS.hasCycle(adjList, 5))
//            System.out.println("Graph contains cycle");
//        else
//            System.out.println("Graph doesn't contain cycle");

        //Check cycle using DFS
        //Construct the adj , array of list
//        ArrayList<Integer>[] adjArray = new ArrayList[5];
//        int i=0;
//        for(LinkedList<Integer> ll: adj){
//            adjArray[i++] = new ArrayList<>(ll);
//        }
//        DetectCycleDFS detectCycleDFS = new DetectCycleDFS();
//        if(detectCycleDFS.hasCycle(adjArray, 5))
//            System.out.println("Graph contains cycle");
//        else
//            System.out.println("Graph doesn't contain cycle");


        //2nd Graph example
        Graph g2 = new Graph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);

        ArrayList<Integer>[] adjArray = new ArrayList[3];
        int i=0;
        for(LinkedList<Integer> ll: adj){
            adjArray[i++] = new ArrayList<>(ll);
        }
        DetectCycleDFS detectCycleDFS = new DetectCycleDFS();
        if(detectCycleDFS.hasCycle(adjArray, 3))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");

    }
}

