package bladetooffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class permutationoffer38 {

    public static void main(String[] args) {

        String input="ryawrowv";
        System.out.println(permutation(input));
    }
    //我写的，留下来了标准答案
//    public static String[] permutation(String s) {
//        String[] result= {};
//
//        for(char c:s.toCharArray()){
//            result=dtghstring(result,c);
//        }
//        return result;
//    }
//    public static String[] dtghstring(String[] pre,char c){
//
//        if (pre.length==0) {
//            String[] result1=new String[pre.length+1];
//            result1[0]=String.valueOf(c);
//            return  result1;
//        }
//
//        List<String> chachong=new ArrayList<>();
//        for(int i=0;i< pre.length;i++){
//            if(pre[i]==null) break;
//            StringBuffer temp = new StringBuffer(pre[i]);
//            //System.out.println(i+" i zhongjian "+" c: "+c+" val:"+temp.toString());
//            for(int j=0;j< pre[0].length()+1;j++){
//                StringBuffer temp1=new StringBuffer(temp);
//                temp1.insert(j,c);
//                if(!chachong.contains(temp1.toString())){chachong.add(temp1.toString());
//                    //result1[i*(pre[0].length()+1)+j]=temp1.toString();
//                   System.out.println(i+" i j "+j+" c: "+c+" val:"+temp1.toString());
//                }
//            }
//        }
//        String[] result1=new String[chachong.size()];
//        int i=0;
//        for(String temp:chachong){
//            result1[i]=temp;
//            i++;
//        }
//        return result1;
//    }
    public static List<String> res = new LinkedList<>();
    public static char[] c;
    static public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    static void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c));      // 添加排列方案
            return;
        }
        List<Character> set = new ArrayList<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x);                      // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1);                      // 开启固定第 x + 1 位字符
            swap(i, x);                      // 恢复交换
        }
    }
    static void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}
