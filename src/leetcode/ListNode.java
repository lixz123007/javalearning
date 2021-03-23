package leetcode;

import static java.lang.Math.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode l1=new ListNode(9);
        ListNode l2=new ListNode(9, l1);
        ListNode l3=new ListNode(9,l2);
        ListNode l4=new ListNode(9,l3);
        ListNode l5=new ListNode(9,l4);
        ListNode l6=new ListNode(9,l5);
        ListNode l7=new ListNode(9,l6);
        ListNode l8=new ListNode(9,l7);
        ListNode l9=new ListNode(9,l8);
        ListNode l10=new ListNode(9,l9);

        int al1[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int count=31;
        ListNode next3=new ListNode(al1[count-1]);
        count--;
        while(count!=0){
            ListNode next1=new ListNode(al1[count-1],next3);
            System.out.println(next1.val+" in "+count);
            next3=next1;
            count--;
        }
        l1=next3;

        ListNode r1=new ListNode(4);
        ListNode r2=new ListNode(5, r1);
        ListNode r3=new ListNode(6, r2);
        ListNode r4=new ListNode(5,r3);

        int[] aal1 = new int[99];
        int[] aal2 = new int[99];

        int[] aval = new int[99];

        ListNode n1=new ListNode();
        ListNode n2=new ListNode();
        n1 =next3;
        n2 =r3;
        int upp=0;
        int cc=0;
        int val1=0;
        int val2=0;


        ListNode zero=new ListNode(0);
        System.out.println(zero.next);
        //ListNode next2=new ListNode();
        while(cc<=99){
            if(n1==null&&n2==null&&upp==0)
                break;
            if(n1==null)
                n1=zero;
            if(n2==null)
                n2=zero;

            int val=n1.val+n2.val+upp;

            upp=val/10;
            val=val%10;
            //ListNode next1=new ListNode(val,next2);
            aval[cc]=val;
            System.out.println(cc+" val:  "+val+" upp: "+upp+" n1 "+n1.val+" n2:"+n2.val);
            //next2=next1;
            n1=n1.next;
            n2=n2.next;
            cc++;
        }
        ListNode next2=new ListNode(aval[cc]);
        cc--;
        while(cc>=0){
            ListNode next1=new ListNode(aval[cc],next2);
            System.out.println(cc+"  "+aval[cc]);
            next2=next1;
            cc--;
        }

//
//        int i=0;
//        long x=0;
//        long result=0;
//
//
//
//
//
//        n1 =next3;
//        System.out.println(next3.next);
//        int i1=0;
//        int i2=0;
//        long sum=0;
//        long sum2=0;
//        while(n1!=null)
//        {
//            System.out.println(n1.val+" while1 "+sum);
//            sum=sum*10+n1.val;
//            n1=n1.next;
//            i1++;
//        }
//        x=sum;
//        System.out.println(i1+" whileout "+sum);
//        while(i<i1){
//            result=result*10+(int)(x%10);
//            i++;
//            x=(x-(int)(x%10))/10;
//            System.out.println(x+" rev "+result);
//        }
//        System.out.println(sum+" revout "+result);
//        sum=result;
//        n1 =r3;
//        while(n1!=null)
//        {
//            //System.out.println(n1.val);
//            sum2=sum2*10+n1.val;
//            n1=n1.next;
//            i2++;
//        }
//        x=sum2;
//        result=0;
//        i=0;
//        while(i<i2){
//            result=result*10+(int)(x%10);
//            i++;
//            x=(x-(int)(x%10))/10;
//
//        }
//        System.out.println(sum2+" "+result);
//        sum2=result;
//        sum=sum+sum2;
//
//        if(i1<i2){
//            //i2++;
//            i1=i2;
//        }
//        //else
//        //{
//        //i1++;
//        //}
//        System.out.println(i1+" "+sum+" "+sum/Math.pow(10, i1));
//        if(sum/Math.pow(10, i1)<1)
//        {
//            i2=i1;}
//        else
//        {
//            //if(sum/Math.pow(10, i1--)!=0)
//            // {
//            // i2=i1-1;
//            //}
//            // else
//            i2=i1+1;
//        }
//
//
//        System.out.println(i2);
//
//        ListNode next2=new ListNode((int)(sum/Math.pow(10,i2-1)));
//        System.out.println(sum/pow(10,i2-1));
//        sum=(long)(sum%Math.pow(10,i2-1));
//        System.out.println(sum);
//        i2--;
//        while(i2>0){
//
//            ListNode next1=new ListNode((int)(sum/Math.pow(10,i2-1)),next2);
//            System.out.println(sum+"  "+(int)(sum/pow(10,i2-1)));
//            next2=next1;
//            sum=(long)(sum%Math.pow(10,i2-1));
//            i2--;
//        }

        /*ListNode next2=new ListNode((int)(sum/pow(10,i2-1)));
        System.out.println(sum/pow(10,i2-1));
        sum=(int)(sum%pow(10,i2-1));
        System.out.println(sum);
        i2--;
        while(i2>0){

            ListNode next1=new ListNode((int)(sum/pow(10,i2-1)),next2);
            System.out.println(sum+"  "+(int)(sum/pow(10,i2-1)));
            next2=next1;
            sum=(int)(sum%pow(10,i2-1));
            i2--;
        }


        ListNode next2=new ListNode(sum%10);
        sum=sum/10;
        while(sum!=0){
            ListNode next1=new ListNode(sum%10,next2);
            System.out.println(sum+"  "+(int)(sum%10));
            next2=next1;
            sum=sum/10;
        }*/

    }
}

