package bladetooffer;

public class offer25 {
    public static void main(String[] args) {

    }
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     ListNode result=new ListNode();
    //     if(l1==null)return l2;
    //     if(l2==null)return l1;
    //     if(l1.val<l2.val){
    //             result.val=l1.val;
    //             l1=l1.next;
    //         }else{
    //             result.val=l2.val;
    //             l2=l2.next;
    //         }
    //     ListNode head=result;
    //     while(l1!=null&&l2!=null){
    //         ListNode temp=new ListNode();
    //         if(l1.val<l2.val){
    //             temp.val=l1.val;
    //             l1=l1.next;
    //         }else{
    //             temp.val=l2.val;
    //             l2=l2.next;
    //         }
    //         result.next=temp;
    //         result=temp;


    //     }
    //     if(l1!=null&&l2==null){
    //         result.next=l1;
    //     }else
    //     {
    //         result.next=l2;
    //     }
    //     return head;

    // }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
