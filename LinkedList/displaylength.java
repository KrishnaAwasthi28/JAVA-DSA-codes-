//Make the Lenght function to find the length of Linked List
public class displaylength{
    static int length(Node head){
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(length(a));
    }
}

