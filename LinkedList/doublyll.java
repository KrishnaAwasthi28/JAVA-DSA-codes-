public class doublyll {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void displayFromHead(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayFromTail(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayFronRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtTail(Node head,int x){
        Node temp=head;
        //Tail tk leke jao
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAt(Node head,int pos,int val){
        Node s=head;
        for(int i=0;i<pos-1;i++){
            s=s.next;
        }
        //s is at idx-1 position
        Node r=s.next;
        Node t=new Node(val);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static void deleteHead(Node head){
        head=head.next;
        head.prev=null;
    }
    public static void deleteTail(Node head){ //head node is given
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void deleteAt(Node head,int pos){
        Node l=head;
        for(int i=0;i<pos-1;i++){
            l=l.next;
        }
        Node r=l.next.next;
        l.next=r;
        r.prev=l; 
    }
    public static void main(String args[]){
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        // displayFromTail(e);
        // displayFronRandom(d);
        // Node newHead=insertAtHead(a, 20);
        // insertAtTail(a, 100);
        // displayFromHead(newHead);
        // insertAt(a, 3, 21);
        displayFromHead(a);
        // deleteTail(a);
        deleteAt(a, 3);
        displayFromHead(a);
    }
}
