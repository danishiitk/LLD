package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Pair{
    int vertex;
    int distVertex; //distance for the source node
    Pair(int vertex, int distVertex){
        this.vertex = vertex;
        this.distVertex = distVertex;
    }
}
public class Djekstra {
    public int[] shortestDistance(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s){
        //Create the distance array and initialize
        int[] dist = new int[V];
        for(int i=0 ;i<V; i++) dist[i] = (int)1e9;

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.distVertex - p2.distVertex); //min heap
        pq.add(new Pair(s, 0));
        while (!pq.isEmpty()){
            Pair curPair = pq.poll();
            int curVertex = curPair.vertex;
            int curDistance = curPair.distVertex;
            for(ArrayList<Integer> neighb: adj.get(curVertex)){
                int neighbVertex = neighb.get(0);
                int neighbDistFromCur = neighb.get(1);
                if(curDistance+neighbDistFromCur<dist[neighbVertex]) {
                    dist[neighbVertex] = curDistance + neighbDistFromCur;
                    pq.add(new Pair(neighbVertex, dist[neighbVertex])); //Add the neighb node with updated dist
                }
            }
        }
        return dist;
    }


}
