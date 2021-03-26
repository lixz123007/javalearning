package bladetooffer;

import java.util.Stack;

public class validateStackSequencesoffer31 {
    public static void main(String[] args) {
//    int a=3,b=2;
//    int i=(--a==b++)?--a:++b;
//    int j=a++;
//    int k=b;
//    System.out.println("i= "+i+" ,j="+j+" ,k="+k);
    int[] a={2,1,0};
    int[] b={1,2,0};
    System.out.println(validateStackSequences(a,b));

    }
    static public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        if(pushed.length==popped.length&&pushed.length==0)
            return true;
        if(popped.length!=popped.length)
            return false;
        int i=0;
        int j=0;
        int time=0;
        while(j<popped.length){
            if(i< pushed.length){
                stack.push(pushed[i]);
                i++;
            }

            while(!stack.isEmpty()&&popped[j]==stack.peek()){
                stack.pop();
                j++;
            }

            time++;
            if(time>2* pushed.length)
                return false;


        }
        return true;
    }
}
