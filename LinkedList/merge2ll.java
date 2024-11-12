//Merge two sorted list using extra space
public class merge2ll {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode mergeTwoList(ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while(temp1!=null || temp2!=null){
            if(temp1.val<temp2.val){
                ListNode a=new ListNode(temp1.val);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }else{
                ListNode a=new ListNode(temp2.val);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        if(temp2==null){
            temp.next=temp1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(10);
        ListNode b=new ListNode(20);
        ListNode c=new ListNode(30);
        a.next=b;
        b.next=c;
        c.next=null;
        ListNode d=new ListNode(11);
        ListNode e=new ListNode(21);
        ListNode f=new ListNode(31);
        d.next=e;
        e.next=f;
        f.next=null;
        ListNode ans=mergeTwoList(a, d);
        while(ans.next!=null){
            System.out.println(ans.val+" ");
            ans=ans.next;
        }
    }

}
