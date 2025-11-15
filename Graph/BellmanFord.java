//Bellman Ford Algorithm

import java.util.*;
public class BellmanFord {
    public static int[] bellmanFord(int V,ArrayList<ArrayList<Integer>> edges,int src){
        int[] dist=new int[V];
        Arrays.fill(dist,(int)1e8);
        dist[src]=0;
        for(int i=0;i<V;i++){
            for(ArrayList<Integer> edge:edges){
                int u=edge.get(0);
                int v=edge.get(1);
                int w=edge.get(2);
                if(dist[u]+w<dist[v]) dist[v]=dist[u]+w;
            }
        }

        //Negative Cycle check
         for(int i=0;i<V;i++){
            for(ArrayList<Integer> edge:edges){
                int u=edge.get(0);
                int v=edge.get(1);
                int w=edge.get(2);
                if(dist[u]+w<dist[v]) return new int[]{-1};
            }
        }
        return dist;
    }
}
