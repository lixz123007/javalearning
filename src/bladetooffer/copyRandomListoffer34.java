package bladetooffer;

import java.util.ArrayList;
import java.util.List;

public class copyRandomListoffer34 {
    public static void main(String[] args) {

    }
//    public static Node realandcomplexcopyRandomList(Node head) {
//        if(head==null)
//            return null;
//        Node pre=new Node(head.val);
//        List<Node> node=new ArrayList<>();
//        List<Integer> index=new ArrayList<>();
//        List<Integer> wait=new ArrayList<>();
//        List<Integer> waitvalue=new ArrayList<>();
//
//        index.add(pre.val);
//        if(head.random==null)
//            pre.random=null;
//        else
//        {if(head.random.val==pre.val)
//            pre.random=pre;
//        else {
//            wait.add(0);
//            waitvalue.add(head.random.val);
//        }
//        }
//        node.add(pre);
//        head=head.next;
//        int i=1;
//        while(head!=null){
//            Node temp=new Node(head.val);
//            //pre.next=temp;
//            index.add(temp.val);
//            if(head.random==null)
//                temp.random=null;
//            else{
//                if(head.random.val==temp.val)
//                    temp.random=temp;
//                else{
//                    if(index.contains(head.random.val)){
//                        temp.random=node.get(index.indexOf(head.random.val));
//
//                    }else
//                    {
//                        wait.add(index.indexOf(temp.val));
//                        waitvalue.add(head.random.val);
//                    }}}
//            node.add(temp);
//            node.get(i-1).next=node.get(i);
//            //pre=temp;
//            head=head.next;
//            i++;
//        }
//        node.get(i-1).next=null;
//        for(int j=0;j< wait.size();j++){
//            node.get(wait.get(j)).random=node.get(index.indexOf(waitvalue.get(j)));
//            System.out.println(j+" i+index: "+wait.get(j));
//        }
//
//        return node.get(0);
//    }
//
//    public static Node copyRandomList(Node head) {
//        if(head==null)
//            return null;
//
//        List<Node> node=new ArrayList<>();
//        List<Integer> index=new ArrayList<>();
//        List<Integer> wait=new ArrayList<>();
//        List<Integer> waitvalue=new ArrayList<>();
//
//
//        int i=0;
//        while(head!=null){
//            Node temp=new Node(head.val);
//            //pre.next=temp;
//            index.add(temp.val);
//            if(head.random==null)
//                temp.random=null;
//            else{
//                if(head.random.val==pre.val)
//                    pre.random=pre;
//                else{
//                    if(index.contains(head.random.val)){
//                        temp.random=node.get(index.indexOf(head.random.val));
//
//                    }else
//                    {
//                        wait.add(index.indexOf(temp.val));
//                        waitvalue.add(head.random.val);
//                    }}}
//            node.add(temp);
//            node.get(i-1).next=node.get(i);
//            //pre=temp;
//            head=head.next;
//            i++;
//        }
//        node.get(i-1).next=null;
//        for(int j=0;j< wait.size();j++){
//            node.get(wait.get(j)).random=node.get(index.indexOf(waitvalue.get(j)));
//            System.out.println(j+" i+index: "+wait.get(j));
//        }
//
//        return node.get(0);
//    }
    public static Node zqdacopyRandomList(Node head) {
        if(head==null)
            return null;
        Node start=head;

        while(head!=null){
            Node temp=new Node(head.val);
            temp.next=head.next;
            head.next=temp;
            head=temp.next;

        }

        head=start;
        while(head!=null){
            if(head.random!=null){
                head.next.random=head.random.next;}
            head=head.next.next;
        }
        Node result=start.next;
        Node resulthead=result;
        head=start;

        while (head != null) {
            head.next = head.next.next;
            head = head.next;
            if (resulthead.next != null) {
                resulthead.next = resulthead.next.next;
                resulthead = resulthead.next;
            }
        }


        return result;
    }

}
