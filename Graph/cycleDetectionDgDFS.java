import java.util.*;
public class cycleDetectionDgDFS {
    public static boolean checkIfCycle(int src,List<List<Integer>> adj,boolean[] visited,boolean[] pathVisited){
        visited[src]=true;
        pathVisited[src]=true;
        for(int neighbor:adj.get(src)){
            if(pathVisited[neighbor]) return true;
            if(visited[neighbor]) continue;
            else{
                if(checkIfCycle(neighbor, adj, visited, pathVisited)) return true;
            }
        }
        pathVisited[src]=false;
        return false;
    }
    public static boolean isCyclic(int V,List<List<Integer>> adj){
        boolean[] visited=new boolean[V];
        boolean[] pathVisited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && checkIfCycle(i,adj,visited,pathVisited)) return true;
        }
        return false;
    }
}
