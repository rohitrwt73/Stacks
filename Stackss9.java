import java.util.*;
public class Stackss9 {
    // duplicate parentheses
    public static void main(String[] args) {
        String str1 = "(a+b)";
        String str2 = "((a+b))";
        System.out.println(duplicateParentheses(str2));
        System.out.println(duplicateParentheses(str1));
    }
    public static boolean duplicateParentheses(String str){
        Stack<Character> s= new Stack<>();
         for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch ==')'){
                int count =0;
                while (s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
             
             else{
                s.pop();
             }
            }
           else{
            s.push(ch);
           }
            
         }
         return false;
    }
}
