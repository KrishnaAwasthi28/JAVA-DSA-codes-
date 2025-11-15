//Topo Sort Using Kahn's Algorithm
import java.util.*;
public class topoSort {
    public static ArrayList<Integer> topoSorting(int N,List<List<Integer>> adj){
        ArrayList<Integer> res=new ArrayList<>();
        int[] indegree=new int[N];
        for(int i=0;i<adj.size();i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indegree[i]==0) q.offer(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int neighbor:adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0) q.offer(neighbor);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // number of vertices
        int E = sc.nextInt(); // number of edges

        // adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            System.out.println("From");
            int u = sc.nextInt();
            System.out.println("To");
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        List<Integer> ans=topoSorting(V, adj);
        System.out.println(ans);
        sc.close();
    }
}
