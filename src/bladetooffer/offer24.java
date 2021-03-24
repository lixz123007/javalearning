package bladetooffer;

public class offer24 {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode res1=new ListNode();
        res1.val=head.val;
        res1.next=null;
        head=head.next;
        while(head!=null)
        {
            ListNode res2=new ListNode();
            res2.val=head.val;
            res2.next=res1;
            res1=res2;
            head=head.next;


        }
        return res1;

    }
}
