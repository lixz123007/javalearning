package leetcode;

public class myAtoi8 {
    public static void main(String[] args) {
        String intput = " -9.12834 aefaef";
        long startTime =  System.currentTimeMillis();
        System.out.println(intput.length());
        System.out.println(myAtoi(intput));

    }
    public static int myAtoi(String s) {
        int zf=1;
        long sum=0;
        if(s==""){
            return 0;
        }
        for (char c : s.toCharArray()) {
            if(sum==0&&c==' ')
                continue;
            if(c=='-')
                {zf=-1;continue;}

            if(c=='+')
                continue;
            if(Character.isDigit(c))
            {
                if(sum*10+(int)c-'0'>2147483647) {
                    if (zf < 0)
                        return -2147483648;
                    else
                        return 2147483647;
                }
                sum=sum*10+(int)c-'0';
                continue;
            }
            else
            {if(sum>0&&(c==' '||c=='.'))
                return (int)(sum)*zf;}


            return 0;
        }
        return (int)(sum)*zf;
    }
}
