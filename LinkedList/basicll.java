public class basicll{
    public static void displayR(Node head){ //Recursive function to display linked list
        if(head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);
    }
    public static class Node{ //Creating the node class
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        //Creating nodes
        Node n1=new Node(5);
        Node n2=new Node(3);
        Node n3=new Node(9);
        Node n4=new Node(18);
        Node n5=new Node(7);
        //Connecting the nodes
        n1.next=n2;  //n1 connected to n2
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        //we can get data of n2 using n1 by -> n1.next.data;
        //we can get data of n4 using n1 by -> n1.next.next.next.data; and so on
        
        //Displaying the Linked List
        // Node temp=n1; //creating a pointer that is pointing on n1 initially;
        // for(int i=1;i<=5;i++){
        //     System.out.print(temp.data +" ");
        //     temp=temp.next;
        // }
        
        //If we dont know about the size of the Linked List then,
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        
        displayR(n1); //recursive function to display
    }
}