package bladetooffer;

public class cuttingRopeoffer14 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(119));
    }

    public static int cuttingRope(int n) {
        if(n<=0)return 0;
        int[] a=new int[n+1];

        a[1]=1;
        a[2]=1;
        a[3]=2;
        a[4]=4;
        a[5]=6;
        a[6]=9;
        if(n<=6)return a[n];
        for(int i=7;i<=n;i++){
            a[i]=a[i-3]*3;

        }
        return a[n];



    }
}
