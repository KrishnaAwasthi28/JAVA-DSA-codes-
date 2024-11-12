public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtBegin(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insertAt(int idx,int val){
            Node add=new Node(val);
            Node temp=head;
            if(idx==0){
                insertAtBegin(val);
                return;
            }
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            add.next=temp.next;
            temp.next=add;
            size++;
        }
        int getElement(int idx){
            Node temp=head;
            if(idx>size || idx<0){
                System.out.println("Wrong Index !");
                return -1;
            }
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAtBegin(){
            Node temp=head;
            temp=temp.next;
            head=temp;
        }
        void deleteAtEnd(){
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        void deleteAtIndex(int idx){
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        LinkedList L1=new LinkedList();
        L1.insertAtEnd(12);
        L1.insertAtEnd(20);
        L1.insertAtEnd(30);
        L1.insertAtBegin(1);
        L1.insertAt(0, 28);
        L1.insertAt(5, 100);
        L1.display();
        // System.out.println(L1.getElement(0));
        L1.deleteAtEnd();
        L1.display();

    }
}
