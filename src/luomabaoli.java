public class luomabaoli {
        public static int romanToInt(String s) {
            int num=s.length();
            int i=0;
            int nv=0;
            int lv=0;
            char[] cs=s.toCharArray();
            int result=0;
            while(i<num)
            {
                switch(cs[i]){
                    case 'I':
                        nv=1;
                        break;
                    case 'V':
                        nv=5;
                        break;
                    case 'X':
                        nv=10;
                        break;
                    case 'L':
                        nv=50;
                        break;
                    case 'C':
                        nv=100;
                        break;
                    case 'D':
                        nv=500;
                        break;
                    case 'M':
                        nv=1000;
                        break;
                }
                if(lv>=nv){
                    result=result+lv;
                }else{
                    result=result-lv;
            }
                lv=nv;
                i++;
            }
            result=result+lv;
            return  result;
        }

    public static void main(String[] args) {
        String s="III";
        char[] cs=s.toCharArray();
        System.out.println(romanToInt(s));
    }
}
