package helloworld;

public class lianghe {
    public static int reverse(int x) {
//        int y=-1;
//        if (x>0){
//            y=1;}
        int i=0;
        double result=0;
        //int[] result= new int[10]
        while(x!=0){

            result=result+(x%10)*Math.pow(10,10-i);
            i++;
            x=x/10;

        }
       // System.out.println(y);
        result=result/(Math.pow(10,11-i));
        System.out.println(result);

        if (result>Math.pow(2,31)||result<=-Math.pow(2,31)){
            return 0;
        }
        return (int)(result);

    }
    public static int reverse2(int x) {
//        int y=-1;
//        if (x>0){
//            y=1;}
        int i=0;
        int result=0;
        //int[] result= new int[10]
        while(x!=0){

            result=result*10+x%10;
            i++;
            x=x/10;
            if(i==9&&result>=20000000&&x!=0){
                return 0;
            }
        }
        // System.out.println(y);
       // result=result/(Math.pow(10,11-i));
        System.out.println(result);

//        if (result>Math.pow(2,31)||result<=-Math.pow(2,31)){
//            return 0;
//        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse2(-120));
        System.out.println(reverse2(1534236469));

    }


}
