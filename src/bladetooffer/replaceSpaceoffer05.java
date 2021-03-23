package bladetooffer;

public class replaceSpaceoffer05 {
    public static void main(String[] args) {
        String intput = " ";
        long startTime =  System.currentTimeMillis();
        System.out.println(intput.length());
        System.out.println(replaceSpace(intput));
    }
    public static String replaceSpace(String s) {
        if(s==""){
            return "";
        }


        String result=new String();
        for (char c : s.toCharArray()) {
            if(c==' '){
                //result.concat(add);
                result=result+"%20";
            }else
            {
                //result.concat(String.valueOf(c));
                result=result+c;
            }

        }
        return result;
    }
    public static String speedest(String s){
        return s.replace(" ","%20");
    }
    public static String savespace(String s){

            int length = s.length();
            char[] array = new char[length * 3];
            int size = 0;
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (c == ' ') {
                    array[size++] = '%';
                    array[size++] = '2';
                    array[size++] = '0';
                } else {
                    array[size++] = c;
                }
            }
            String newStr = new String(array, 0, size);
            return newStr;



    }

}
