import java.util.*;

public class cycleDetectionUgDFS {
    public static boolean checkIfCycle(int src,int parent,List<List<Integer>> adj,boolean[] visited){
        visited[src]=true;
        for(int neighbor:adj.get(src)){
            if(neighbor==parent) continue;
            if(visited[neighbor]) return true;
            else{
                if(checkIfCycle(neighbor, parent, adj, visited)) return true;
            }
        }
        return false;
    }
    public static boolean isCycle(int V,List<List<Integer>> adj){
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(i,-1,adj,visited)) return true;
        }
        return false;
    }
}
