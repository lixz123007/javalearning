package bladetooffer;

public class isMatchofferoffer19 {
    public static void main(String[] args) {
        String intput = "mississippi";
        String intput2 = "mis*is*ip*.";
        System.out.println(isMatch(intput,intput2));
    }
    public static boolean isMatch(String s, String p) {
        char[] s1=s.toCharArray();
        char[] s2=p.toCharArray();
        if(p==".*"){
            return true;
        }
        int[] hade=new int[99];
        int k=1;
        hade[0]=-1;
        for (int j=0;j<p.length();j++){
            if(s2[j]=='*'){
                hade[k]=j;
                k++;
            }

        }
        if(k==1){
            if(s.length()!=p.length())return false;
        for(int i=0;i<s.length()&&i<p.length();i++){

            if(s2[i]!=s1[i]) {
                if (s2[i] != '.'){
                    return false;

                }
            }
        }
        return true;
        }
        else{
            int h=0;
            int h1=0;
            int f=0;
            for(int j=1;j<k;j++){
                int hh=h;
                f=0;
                for(int j1=hade[h1]+1;j1<hade[h1+1];j1++){
                    System.out.println("in side j1:"+j1+" s1[hh]:"+s1[hh]+" s2[j1]:"+s2[j1]+" h1:"+h1+"hh+:"+hh+"hade:"+hade[h1+1]+" hade2:"+hade[h1]+" f:"+f);
                    if(s1[hh]!=s2[j1]){
                        if(s2[j1]!='.')
                        {f=1;
                        break;}
                    }else {
                        hh++;
                    }
                }
                if(f==1){
                h1++;}
                else{
                    k++;
                h=h+hade[h1+1]-hade[h1]-1;
                if(h>=s.length())return true;

                }
                System.out.println(h+"h+slen:"+s.length()+" k:"+k+" h1:"+h1+" hh:"+hh+" hade: "+hade[h1+1]+" hade2: "+hade[h1]+" f:"+f+" j:"+j+" k:"+k);

            }
            System.out.println(s.length()-h);
            System.out.println(p.length()-hade[h1]-1);

            if(s.length()-h!=p.length()-hade[h1]-1)return false;

            for(int j=hade[h1]+1;j<p.length();j++){
                if(s1[h1]!=s2[j]){
                    if(s2[j]!='.')
                    {
                        return false;}
                h1++;
            }}




        }

        return true;
    }
}
