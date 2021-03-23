package leetcode;

public class longestPalindrome5 {
    public static void main(String[] args) {
        String intput = "abb";
        long startTime =  System.currentTimeMillis();
        System.out.println(intput.substring(0,3));

        System.out.println(longestPalindromeway2(intput));


    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "0";
        }
        if(isPalindrome(s))
            return s;
        String result = s.substring(0,1);

        for(int i=1;i<s.length()-1;i++){
            int hade=0;
            int end=0;
            for(int j=0;j<s.length()-i;j++){
                System.out.println(i+","+j);
                if(isPalindrome(s.substring(j,j+i+1))){
                    result = s.substring(j,j+i+1);
                    System.out.println(result);
                    break;
                }
            }

        }

    return result;
    }
    public static String longestPalindromeway2(String s) {
        if (s == null || s.length() == 0) {
            return "0";
        }
        if(isPalindrome(s))
            return s;
        String result = s.substring(0,1);

        for(int i=s.length();i>1;i--){
            for(int j=0;j<s.length()-i+1;j++){
                System.out.println(i+","+j);
                if(isPalindrome(s.substring(j,j+i))){
                    result = s.substring(j,j+i);
                    System.out.println(result);
                    return result;
                }
            }

        }

        return result;
    }

    public static boolean isPalindrome(String x) {
        for(int i=0;i<x.length()/2;i++)
        {
            if(x.charAt(i)!=x.charAt(x.length()-i-1)){
                return false;
            }
        }


        return true;
    }
    public static int reverse(int x) {

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            rev = rev * 10 + pop;
        }
        return rev;

    }
    public static String biaozhundaan(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
