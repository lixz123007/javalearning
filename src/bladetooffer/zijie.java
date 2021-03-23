package bladetooffer;

import java.util.*;
import java.util.stream.Collectors;

public class zijie {
    public static void main(String[] args) {
        int[] data={6,4,76,19,23,30,1};
        List a=new ArrayList();
        List b=new ArrayList();

        a= Arrays.stream(data).boxed().collect(Collectors.toList());
        Collections.sort(a);
        System.out.println(a.get(0));

        Scanner cin = new Scanner(System.in);
        int N;
        N = cin.nextInt();
        // 读取输入，直到没有整型数据可读
        for(int i=0;i<N;i++)
        {
            // 读取N 和 M

            b.add(cin.nextInt());
        }
        Collections.sort(b);
        System.out.println(N+" "+b);
        Integer[] c = new Integer[b.size()];//当泛型为Integer时，需要
        c = (Integer[])b.toArray(c);
        int result=0;
        for(int i=0;i<N;i+=3){
            if(i+1==N){
                result+=2;
                break;
            }else if(i+2==N){
                result+=1;
                break;
            }else{
                if(c[i+1]-c[i]>10&&c[i+1]-c[i]<=20) {
                    result++;
                    i--;
                    continue;
                }else if(c[i+1]-c[i]>20){
                    result+=2;
                    i-=2;
                    continue;
                }
                if(c[i+2]-c[i+1]>10)
                {result++;i--;}


            }
        }
        System.out.println(result);
    }
}
