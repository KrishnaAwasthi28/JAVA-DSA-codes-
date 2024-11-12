import java.util.*;
public class InsertEnd {
    public static void displayR(Node head){ //Recursive function to display linked list
        if(head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println("Enter node to insert at end :");
        Node add=new Node(sc.nextInt());
        d.next=add;
        displayR(a);
        sc.close();

    }
}
