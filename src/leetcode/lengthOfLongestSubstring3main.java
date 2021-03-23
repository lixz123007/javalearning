package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lengthOfLongestSubstring3main {
    public static void main(String[] args) {

        String intput = "dakjerhgklauherfg";
        long startTime =  System.currentTimeMillis();
/** 程序运行 processRun();*/

/** 获取当前的系统时间，与初始时间相减就是程序运行的毫秒数，除以1000就是秒数*/

        System.out.println(lengthOfLongestSubstring(intput));
        long endTime =  System.currentTimeMillis();
        long usedTime = (endTime-startTime);
        System.out.println(biaozhundaan(intput));
        long endTime2 =  System.currentTimeMillis();
        long usedTime2 = (endTime2-endTime);
        System.out.println(usedTime2);
    }
    public static int biaozhundaan(String s){
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> chars = new HashSet<Character>();
        int back = 0;
        int front = 0;
        int max = 0;
        while(front < s.length()) {
            char currentChar = s.charAt(front);
            if (!chars.contains(currentChar)) { // 不重复则前指针继续向前
                chars.add(currentChar); //记录
                int tmpMax = front - back + 1;
                if (tmpMax > max) {
                    max = tmpMax;
                }
            } else { //重复则后指针向前移动
                char backChar = s.charAt(back);
                while(backChar != currentChar) { //一直移动到重复字符处
                    chars.remove(backChar);
                    ++back;
                    backChar = s.charAt(back);
                }
                // 后指针越过重复字符
                ++back;
            }
            ++front; //前指针一直向前
        }
        return max;
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0)
        {return 0;}
        int hade1=0;
        //int hade2=0;
        int max=0;
        int now=0;
        Set<Character> hashtable = new HashSet<Character>();
        for(int i=0;i<s.length();i++){

            //System.out.println(i);
            while (hashtable.contains(s.charAt(i))) {
                //return new int[]{hashtable.get(target - nums[i]), i};
                hashtable.remove(s.charAt(hade1));
                hade1++;
            }

            hashtable.add(s.charAt(i));
            //hade2++;
            now=i-hade1+1;
            if(now>max)max=now;
            if(max>=(s.length()-i+1+now))
            { return max; }}
        return max;
    }
}
