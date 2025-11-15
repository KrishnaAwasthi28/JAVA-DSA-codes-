import java.util.*;
public class Degree {
    public static class Graph{
        List<List<Integer>> adjList;
        Graph(int nodes){
            adjList=new ArrayList<>();
            for(int i=0;i<nodes;i++){
                adjList.add(new ArrayList<>());
            }
        }
        static void degreeUndirected(int[][] edges,int nodes){
            int[] degree=new int[nodes];
            for(int edge[]:edges){
                int u=edge[0];
                int v=edge[1];
                degree[u]++;
                degree[v]++;
            }
            //printing the degree
            for(int i=0;i<nodes;i++){
                System.out.println("node "+i+": degree -> "+degree[i]);
            }
        }
        static void degreeDirected(int[][] edges,int nodes){
            int[] indegree=new int[nodes];
            int[] outdegree=new int[nodes];
            for(int edge[]:edges){
                int from=edge[0];
                int to=edge[1];
                indegree[from]++;
                outdegree[to]++;
            }
            //printing the degree
            for(int i=0;i<nodes;i++){
                System.out.print("node "+i+": in-degree -> "+indegree[i]+" - ");
                System.out.print("out-degree -> "+outdegree[i]);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int nodes=4;
        int edges[][]={{0,2},{0,1},{2,3}};
        Graph graph=new Graph(nodes);
        System.out.println("Degree of Undirected graph ");
        graph.degreeUndirected(edges, nodes);
        System.out.println("Degree of Directed graph");
        graph.degreeDirected(edges, nodes);
    }
}
