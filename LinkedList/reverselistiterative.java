//Revering a list using iterative method - TC - O(1), SC- O(N)

public class reverselistiterative {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode agla=curr.next;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
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
