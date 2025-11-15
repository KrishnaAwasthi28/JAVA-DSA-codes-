import java.util.*;
public class BFS {
    public static ArrayList<Integer> bfsOfGraph(int nodes,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[nodes];
        visited[0]=true;
        q.offer(0);
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int neighbor:adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    q.offer(neighbor);
                }
            }
        }
        return res;
    }
}
