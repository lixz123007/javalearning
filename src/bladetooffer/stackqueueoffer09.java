package bladetooffer;

import java.util.Stack;

public class stackqueueoffer09 {

}
class CQueue {
    Stack<Integer> a = new Stack();
    Stack<Integer> b = new Stack();

    public CQueue() {

    }

    public void appendTail(int value) {

        a.push(value);
    }

    public int deleteHead() {
        if(!b.empty())return b.pop();
        if(a.empty())
        {
            return -1;
        }
        while(!a.empty()){
            b.push(a.pop());
        }

        return b.pop();
    }
}
