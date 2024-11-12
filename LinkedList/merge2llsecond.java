//Merge two sorted list without using extra space
public class merge2llsecond {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode mergeTwoList(ListNode head1,ListNode head2){
        ListNode h=new ListNode(100);
        ListNode t=h;
        ListNode t1=head1;
        ListNode t2=head2;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }
        if(t2==null){
            t.next=t1;
        }
        return h.next;
    }
}
