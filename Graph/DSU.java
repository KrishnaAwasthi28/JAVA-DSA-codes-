public class DSU {
    static int parent[];
    static int rank[];
    static int components;
    DSU(int nodes){
        this.parent=new int[nodes];
        this.rank=new int[nodes];
        this.components=nodes;

        for(int i=0;i<nodes;i++){
            parent[i]=i;
        }
    }
    public static int findRootParent(int x){
        if(x==parent[x]) return x;
        parent[x]=findRootParent(parent[x]);
        return parent[x];
    }
    public static void FindUnion(int node1,int node2){
        //Find root parent of both nodes
        int rootParent1=findRootParent(node1);
        int rootParent2=findRootParent(node2);
        if(rootParent1==rootParent2) return;
        //Reduce the components
        components--;
        
        //Merge the components
        if(rank[rootParent1]<rank[rootParent2]) parent[rootParent1]=rootParent2;
        else if(rank[rootParent2]<rank[rootParent1]) parent[rootParent2]=rootParent1;
        else{
            parent[rootParent2]=rootParent1;
            rank[rootParent1]++;
        }
    }
    public static void main(String[] args) {
        DSU dsu=new DSU(5);
        System.out.println("total components->"+dsu.components);
        System.out.println(dsu.findRootParent(0)==findRootParent(3));
        dsu.FindUnion(0, 3);
        System.out.println("total components->"+dsu.components);
        System.out.println(dsu.findRootParent(0)==findRootParent(3));
    }
}
