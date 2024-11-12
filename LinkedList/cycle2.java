//Find out the node where the cycle begins i.e.e the node at which the tail node points.
public class cycle2 {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    public static ListNode cycleBegins(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) break;
        }
        ListNode temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(100);
        ListNode b=new ListNode(13);
        ListNode c=new ListNode(5);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=b;
        ListNode point=cycleBegins(a);
        System.out.println(point.data);
    }
}
