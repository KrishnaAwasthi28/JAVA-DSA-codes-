//Dijkstras Algorithm :)

import java.util.*;
public class DijkstrasAlgo {
    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] p1,int[] p2){
                return p1[1]-p2[1];
            }
        });
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] pair=pq.poll();
            int u=pair[0];
            int d=pair[1];
            if(d>dist[u]) continue;
            for(List<Integer> neighbor: adj.get(u)){
                int v=neighbor.get(0);
                int w=neighbor.get(1);
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        }
        return dist;
    }
}
