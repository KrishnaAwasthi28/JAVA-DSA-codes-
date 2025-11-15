import java.util.*;

public class StoringGraph {
    public static class Pair{
        int node;
        int weight;
        Pair(int n,int w){
            weight=w;
            node=n;
        }
        @Override
        public String toString(){
            return "("+node+","+weight+")";
        }
    }
    public static class Graph{
        static int[][] adjency;
        static List<List<Integer>> adjList;
        static List<List<Pair>> adjListWeight;
        Graph(int nodes){
            adjency=new int[nodes][nodes];
            adjList=new ArrayList<>();
            adjListWeight=new ArrayList<>();
            for(int i=0;i<nodes;i++){
                adjList.add(new ArrayList<>());
                adjListWeight.add(new ArrayList<>());

            }
        }
        static void addEdges(int[][] edges,boolean isDirected){
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                //directed graph
                if(isDirected){
                    adjency[u][v]=1;
                }else{ //undiretced graph
                    adjency[u][v]=1;
                    adjency[v][u]=1;
                }
            }
        }
        static void addEdgesWithWeight(int[][] edges,boolean isDirected){
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
                //directed graph
                if(isDirected){
                    adjency[u][v]=w;
                }else{ //undiretced graph
                    adjency[u][v]=w;
                    adjency[v][u]=w;
                }
            }
        }
        public static void printMatrix(){
            for(int i=0;i<adjency.length;i++){
                for(int j=0;j<adjency[0].length;j++){
                    System.out.print(adjency[i][j]+",");
                }
                System.out.println();
            }
        }
        static void addEdgesList(int[][] edges,boolean isDirected){
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                //directed graph
                if(isDirected){
                    adjList.get(u).add(v);
                }else{ //undiretced graph
                    adjList.get(u).add(v);
                    adjList.get(v).add(u);
                }
            }
        }
        static void addEdgesWithWeightList(int[][] edges,boolean isDirected){
            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
                //directed graph
                if(isDirected){
                    Pair pair=new Pair(v, w);
                    adjListWeight.get(u).add(pair);
                }else{ //undiretced graph
                    Pair pair1=new Pair(v, w);
                    Pair pair2=new Pair(u, w);
                    adjListWeight.get(u).add(pair1);
                    adjListWeight.get(v).add(pair2);
                }
            }
        }
        static void printList(){
            for(int i=0;i<adjList.size();i++){
                System.out.print(i+"->");
                System.out.print("[");
                for(int j=0;j<adjList.get(i).size();j++){
                    System.out.print(adjList.get(i).get(j)+",");
                }
                System.out.print("]");
                System.out.println();
            }
            
        }
        static void printListWeighted(){
            for(int i=0;i<adjListWeight.size();i++){
                System.out.print(i+"->");
                System.out.print("[");
                for(int j=0;j<adjListWeight.get(i).size();j++){
                    System.out.print(adjListWeight.get(i).get(j)+",");
                }
                System.out.print("]");
                System.out.println();
            }
            
        }
    }
    public static void main(String args[])
    {
        int nodes=4;
        System.out.println("Weighted UnDirected Graph :");
        int edges1[][]={{0,2},{0,1},{2,3}};
        Graph graph=new Graph(nodes);
        graph.addEdges(edges1, false);
        graph.printMatrix();

        System.out.println("Weighted Directed Graph :");
        int edges2[][]={{0,2,10},{0,1,30},{2,3,10}};
        Graph graph2=new Graph(nodes);
        graph2.addEdgesWithWeight(edges2, true);
        graph2.printMatrix();

        System.out.println("Undirected Graph ADJ List");
        graph.addEdgesList(edges1, false);
        graph.printList();

        System.out.println("Weighted UnDirected Graph :");
        graph2.addEdgesWithWeightList(edges2, false);
        graph2.printListWeighted();
    }
}
