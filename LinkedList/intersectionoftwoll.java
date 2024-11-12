//Print the Intersection Node of Two sigly Linked lIst
public class intersectionoftwoll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node intersectiion(Node h1,Node h2){
        Node t1=h1;
        Node t2=h2;
        int s1=0,s2=0;
        while(t1!=null){
            s1++;
            t1=t1.next;
        }
        while(t2!=null){
            s2++;
            t2=t2.next;
        }
        t1=h1;
        t2=h2;
        if(s1>s2){
            for(int i=1;i<=(s1-s2);i++){
                t1=t1.next;
            }
        }else{
            for(int i=1;i<=(s2-s1);i++){
                t2=t2.next;
            }
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        Node a1=new Node(90);
        Node b1=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        a1.next=b1;
        b1.next=d;
        Node q=intersectiion(a, a1);
        System.out.println(q.data);
    }
    
}
