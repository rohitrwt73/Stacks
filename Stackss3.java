import java.util.*;
public class Stackss3 {
    //push new element to bottom
    public static void pushAtBottom(Stack <Integer> s, int data ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
            int top = s.pop(); //upar jaate jaate top ko store karana hai
        pushAtBottom(s,data);  //agle level ke liye call
        s.push(top);   //waapis aakar top ko push krde stack ke andar
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
