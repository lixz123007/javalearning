package leetcode;

import java.util.HashMap;
import java.util.Map;

public class zuichangqianzhuiBL {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        Map m1 =new HashMap();
        int i=0;
        int minv=100;
        int mina=0;

        while(i< strs.length){
            m1.put(i,strs[i]);
            if(strs[i].length()<minv){
                minv=strs[i].length();
                mina=i;
            }
            //String s= (String) m1.get(i);
            //char[] cs=((String) m1.get(i)).toCharArray();
            //System.out.print(cs);
            i++;
        }
        int in=((String)m1.get(0)).length();
        char[] cs1=((String) m1.get(mina)).toCharArray();

        String result=new String();

        i=0;
        while(i<minv){

            for(int j=1;j<strs.length;j++){
                //char[] cs1=((String) m1.get(i)).toCharArray();
                char[] cs2=((String) m1.get(j)).toCharArray();
                if(cs1[i]!=cs2[i]){

                    return result;
                }

            }
            result=result.concat(String.valueOf(cs1[i]));
            //System.out.println(result);
            i++;
        }

        //System.out.print("\t" + m1);

        return result;
    }
    public static String longestCommonPrefix2(String[] strs) {
        int num=strs.length;
        if(num==0){
            return "";
        }
        if(num==1){
            return strs[0];
        }
        int i=0;
        int minv=100;
        int mina=0;

        while(i< strs.length){

            if(strs[i].length()<minv){
                minv=strs[i].length();
                mina=i;
            }
            //String s= (String) m1.get(i);
            //char[] cs=((String) m1.get(i)).toCharArray();
            //System.out.print(cs);
            i++;
        }
        //int in=strs[0].length();
        char[] cs1=strs[mina].toCharArray();

        String result=new String();
        System.out.println(mina+" "+minv);

        i=0;
        while(i<minv){

            for(int j=0;j<num;j++){
                //char[] cs1=((String) m1.get(i)).toCharArray();
                char[] cs2=strs[j].toCharArray();
                System.out.println(j+" "+cs2[i]);

                if(cs1[i]!=cs2[i]){

                    return result;
                }

            }
            result=result.concat(String.valueOf(cs1[i]));
            //System.out.println(result);
            i++;
        }

        //System.out.print("\t" + m1);

        return result;
    }
    public static void main(String[] args) {
        String[] input={"kflow","flow","iflow"};
        String[] input1={""};
        String[] input2={"flowui","flow","flowca"};
        String[] input3={"flower","flow","flight"};

        char[] cs1=input[1].toCharArray();
        char[] result2 = new char[10];
        result2[0]=cs1[0];
        result2[1]=cs1[1];
        String result3 = new String();
        result3=result3.concat(String.valueOf(cs1[0]));
        result3=result3.concat(String.valueOf(cs1[1]));
        String b= String.valueOf(result3);
        System.out.println(b);
        System.out.println(longestCommonPrefix(input1));

        System.out.println(longestCommonPrefix2(input2));
        System.out.println(longestCommonPrefix2(input3));

    }
}
