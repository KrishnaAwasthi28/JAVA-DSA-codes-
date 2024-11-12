public class sumHeightDiameter {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static int sumnode(Node root){
        if(root==null) return 0;
        int leftsum=sumnode(root.left);
        int rightsum=sumnode(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int height(Node root){
        if(root==null) return 0;
        int leftH=height(root.left);
        int rightH=height(root.right);
        int myHeight=Math.max(leftH, rightH) + 1;
        return myHeight;
    }
    public static int diameter1(Node root){ //T.C - 0(N^2)
        if(root==null) return 0;
        int diam1=diameter1(root.left);
        int diam2=diameter1(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(Math.max(diam1,diam2),diam3);
    }
    public static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo=new TreeInfo(myHeight, mydiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(n);
        // System.out.println(root.data);
        System.out.println(sumnode(root));
        System.out.println(height(root));
        System.out.println(diameter1(root));
        System.out.println(diameter2(root).diam);
    }
}
