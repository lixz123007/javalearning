package bladetooffer;

import java.util.HashSet;
import java.util.Set;

public class movingCountoffer13 {
    public static Set<Integer> hashSet = new HashSet<Integer>();
    public static void main(String[] args) {


       System.out.println(movingCount(3,4,0));

    }
    public static int movingCount(int m, int n, int k) {


        nextmove(m,n,0,0,k);
        return hashSet.size() ;
    }

    public static boolean nextmove(int m,int n,int si,int sj,int k) {
        System.out.println("si:" + si + " sj:" + sj + " n:" + n );

        if (si < 0 || si >= m || sj < 0 || sj >= n || sum(si,sj) > k) return false;
        int z = si * n + sj;
        if (hashSet.contains(z)) return false;

        hashSet.add(z);
        boolean res =nextmove(m, n, si - 1, sj, k) || nextmove(m, n, si + 1, sj, k) || nextmove(m, n, si, sj-1, k) || nextmove(m, n, si, sj+1, k);
        //hashSet.remove(k);
        return res;
    }
    public static int sum(int i,int j){
        int sum=0;
        while(i>0){
            sum=sum+i%10;
            i=i/10;
        }
        while(j>0){
            sum=sum+j%10;
            j=j/10;
        }
        return sum;
    }

}
