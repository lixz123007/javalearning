package bladetooffer;

public class isNumberoffer20 {
    public static void main(String[] args) {
        String intput2 = ".e1";
        System.out.println(isNumber(intput2));
    }
    public static boolean isNumber(String s) {
        char[] s1=s.toCharArray();
        int zf=0;
        int i=0;
        int ef=0;
        int pf=0;
        while(s1[i]==' '){
            i++;
            if(i==s.length())return false;
        }

        if(s1[i]=='-'){zf=-1;i++;

        }
        else if(s1[i]=='+'){zf=1;i++;}
        else if(s1[i]=='.'){pf=1;i++;
//            if(i==s.length())return false;
//            else if(s1[i]<'0'&&s1[i]>'9')
//                return false;
        }
        else if(s1[i]<'0'||s1[i]>'9')
            return false;

        if((pf==1||zf!=0)&&i>=s.length()){
            return false;
        }
        //if(i+1<s.length()){
        if((pf==1)&&(s1[i]<'0'||s1[i]>'9')){
            return false;
        }//}
        if((zf!=0)&&(s1[i]=='e'||s1[i]=='E')){
            return false;
        }//}
        if((zf!=0)&&s1[i]=='.'&&i+1==s.length()){
            return false;
        }//}


        for(int j=i;j<s.length();j++){
            System.out.println(j+" "+s1[j]);
            if(zf==0&&(s1[j]=='-'||s1[j]=='+')){
                return false;
            }

            if(ef==0&&(s1[j]=='e'||s1[j]=='E')){
                ef=1;
                pf=1;
                if(j+1==s.length()){
                    return false;
                }
                if(s1[j+1]=='-'||s1[j+1]=='+'){
                    if(j+2==s.length())return false;
                    j++;
                    continue;
                }
                if(s1[j+1]=='.'||s1[j+1]==' '){
                    return false;
                    //continue;
                }
                continue;
            }else if(ef==1&&(s1[j]=='e'||s1[j]=='E')){
                //System.out.println(j+"e err "+s1[j]);
                return false;
            }
            if(pf==0&&s1[j]=='.'){
                pf++;
                if(j+1==s.length())return true;
                else if(s1[j+1]<'0'&&s1[j+1]>'9')
                    return false;

                continue;
            }else if(pf==1&&s1[j]=='.')
                return false;
            if(s1[j]==' '){
                while(s1[j]==' '){
                    j++;
                    if(j==s.length())return true;
                }

                if(j<s.length())return false;
            }
            if(s1[j]<'0'||s1[j]>'9')
            {//System.out.println(j+"all err "+s1[j]);
                return false;}
        }
        return true;

    }
}
