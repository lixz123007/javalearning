package bladetooffer;

public class hammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(250));
    }
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int i=0;
        int sum=0;
        while(i<s.length()){
            System.out.println(i);
            i= s.indexOf("1",i)+1;
            if(i==0)
                return sum;
            sum=sum+1;
        }
        return sum;
    }
}
