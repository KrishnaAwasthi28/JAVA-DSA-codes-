//Reverse the given linked list (no reverse print ,reverse the actual list)
//This solution is using recursion TC- O(N),SC- O(N) 
public class reverselist {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode rev=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rev;
    }
    public static void display(ListNode head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.println(head.val+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(10);
        ListNode b=new ListNode(10);
        ListNode c=new ListNode(20);
        ListNode d=new ListNode(30);
        ListNode e=new ListNode(30);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode newhead=reverse(a);
        display(newhead);
    }
}
