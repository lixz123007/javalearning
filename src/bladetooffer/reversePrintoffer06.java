package bladetooffer;

import java.util.ArrayList;

public class reversePrintoffer06 {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
    public int[] myway(ListNode head){
              if(head==null)
              return new int[] {};
              ListNode rh=head;
              int i=0;
              while(head!=null){
                  i++;
                  head=head.next;
              }
              int[] result=new int[i];
              for(int j=i-1;j>=0;j--)
              {
                 result[j]=rh.val;
                 rh=rh.next;
              }
              return result;

    }
}
