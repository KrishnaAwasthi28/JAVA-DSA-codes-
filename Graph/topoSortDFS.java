import java.util.*;
public class topoSortDFS {
    public static void dfs(int src,boolean[] visited,List<List<Integer>> adj,Stack<Integer> st){
        visited[src]=true;
        for(int neighbor:adj.get(src)){
            if(!visited[neighbor]) dfs(neighbor,visited,adj,st);
        }
        st.push(src);
    }
    public static List<Integer> topoSort(int V,List<List<Integer>> adj){
        List<Integer> res=new ArrayList<>();
        boolean[] visited =new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]) dfs(i,visited,adj,st);
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
}
