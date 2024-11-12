public class circularll {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp.next!=head){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=a;
        display(a);
    }
}
