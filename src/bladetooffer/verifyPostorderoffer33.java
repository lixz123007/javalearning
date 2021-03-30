package bladetooffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class verifyPostorderoffer33 {
    public static void main(String[] args) {
    int[] intput={1,3,2,6,5};
    System.out.println(verifyPostorder(intput));
    }
    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length==0)
        return false;
        if(postorder.length==1)
            return true;
        List<Integer> list1 = Arrays.stream(postorder).boxed().collect(Collectors.toList());
        if(verify(list1)){
            return true;
        }
        else
            return false;
    }
    public static boolean verify(List<Integer> all){
        int root= all.get(all.size()-1);
        List<Integer> right=new ArrayList<>();
        List<Integer> left=new ArrayList<>();
        int i=0;
        while(all.get(i)<root&&i<all.size()-1){
            left.add(all.get(i));
            i++;
        }
        while(i<all.size()-1){
            if(all.get(i)>root){
                right.add(all.get(i));
            }
            else
                return false;
            i++;
        }
        if(i!=all.size()-1)
            return false;
        boolean isleft=true;
        boolean isright=true;
        if(left.size()>1)
            isleft=verify(left);
        if(right.size()>1)
            isright=verify(right);
        
        return isleft&&isright;
    }

    public boolean bzdaverifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}
