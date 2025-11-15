import java.util.*;

public class DFS {
    public static ArrayList<Integer> dfsOfGraph(int nodes, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            if (!(visited[i]))
                dfs(i, visited, adjList, res);
        }
        return res;
    }

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adjList,
            ArrayList<Integer> res) {
        visited[node] = true;
        res.add(node);
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor])
                dfs(neighbor, visited, adjList, res);
        }
    }

    public static void main(String[] args) {

    }

}
