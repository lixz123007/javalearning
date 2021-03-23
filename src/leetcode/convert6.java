package leetcode;

public class convert6 {
    public static void main(String[] args) {

        String intput = "PAYPALISHIRING";
        long startTime =  System.currentTimeMillis();
        //System.out.println(intput.substring(0,3));
        System.out.println(intput.length());
        System.out.println(convert(intput,3));
    }
    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }

    public static String myconvert(String s,int numRows){

    return " ";
    }


}
