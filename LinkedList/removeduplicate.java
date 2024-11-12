
public class removeduplicate {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode removeDublicate(ListNode head){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }
            if(temp.next==null) return head;
            if(temp.next.val!=temp.val){
                temp=temp.next;
            }
        }
        return head;
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
        // e.next=null;
        ListNode ans=removeDublicate(a);
        while(ans.next!=null){
            System.out.println(ans.val+" ");
            ans=ans.next;
        }
    }
}
