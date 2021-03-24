package bladetooffer;

public class offer23 {
    public static void main(String[] args) {

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
            if(fast==null)
                break;

        }
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
