import java.util.*;
public class linkedlistStack {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class stack{
        Node head=null;
        int size=0;
        void push(int x){
            // Node head=null;
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(size==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int x=head.data;
            head=head.next;
            return x;
        }
        int peek(){
            if(size==0){
                System.out.println("Stack is Empty !");
                return -1;
            }
            return head.data;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.println(h.data);
        }
        void display(){
            displayRec(head);
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack st=new stack();
        // System.out.println("Enter the number of elements :");
        // int n=sc.nextInt();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());
        // System.out.println(st.peek());
        sc.close();
    }
}
