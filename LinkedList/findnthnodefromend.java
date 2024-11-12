//Find the Nth node from last if only the head is given as parameter;
public class findnthnodefromend {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node getNode(Node head,int n){ //nth index from last
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(9);
        Node d=new Node(10);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node find=getNode(a,3);
        System.out.println(find.data);
    }
}
