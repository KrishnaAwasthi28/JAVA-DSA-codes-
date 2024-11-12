//Given a linked list, find the midle element and delete it from the list

public class midlelementll {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    public static ListNode midle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        int x=0;
        while(fast!=null && fast.next!=null){ //first condn for even size and second for odd size
            fast=fast.next.next;
            slow=slow.next;
            x++;
        }
        ListNode temp=head;
        for(int i=1;i<=x-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return slow;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(100);
        ListNode b=new ListNode(13);
        ListNode c=new ListNode(5);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(12);
        // ListNode f=new ListNode(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // e.next=f;
        ListNode ans=midle(a);
        System.out.println(ans.data);
        display(a);

    }
}
