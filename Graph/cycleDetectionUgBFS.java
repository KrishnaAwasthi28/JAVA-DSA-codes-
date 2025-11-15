//Cycle Detection in Undirected Graph using BFS
import java.util.*;
public class cycleDetectionUgBFS {
    public static boolean checkIfCycle(int src,List<List<Integer>> adj,boolean[] visited){
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{src,-1});
        visited[src]=true;
        while(!q.isEmpty()){
            int[] pair=q.poll();
            int node=pair[0];
            int parent=pair[1];
            for(int neighbor:adj.get(node)){
                if(neighbor==parent) continue;
                if(visited[neighbor]) return true;
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.offer(new int[]{neighbor,node});
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int V,List<List<Integer>> adj){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(checkIfCycle(i,adj,visited)) return true;
        }
        return false;
    }
}
