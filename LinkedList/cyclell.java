//Find whether the given linked list is having a cycle or not
public class cyclell {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
    public static boolean cycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
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
        System.out.println(cycle(a));
    }
}
