//Traverse a list and place all odd values first and then even values.
public class splitll1 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode spiltLL(ListNode head){
        ListNode odd=new ListNode(-1);
        ListNode tempo=odd;
        ListNode even=new ListNode(0);
        ListNode tempe=even;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val%2!=0){
                tempo.next=temp;
                temp=temp.next;
                tempo=tempo.next;
            }
            if(temp.val%2==0){
                tempe.next=temp;
                temp=temp.next;
                tempe=tempe.next;
            }
        }
        tempo.next=even.next;
        return odd.next;
    }
    
}
