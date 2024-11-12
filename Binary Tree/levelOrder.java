import java.util.*;
public class levelOrder {
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
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void levelorder(Node root,int k){
        if(root == null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int lvl=0,sum=0;
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                if(lvl==k) sum+=currNode.data;
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
                lvl++;
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        int n[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(n);
        // System.out.println(root.data);
        levelorder(root,2);
    }
}
