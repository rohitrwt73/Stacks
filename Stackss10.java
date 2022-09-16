import java.util.*;
public class Stackss10 {
    //max area in histogram.
    public static void main(String[] args) {
        int arr[]= {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[]= new int [arr.length];
        int nsl[]= new int [arr.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length -1; i>=0; i--){
            //while loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            //2 if- else
            if(s.isEmpty()){
               nsr[i] = arr.length;
            }
            else{
               nsr[i] = s.peek();
            } 
        s.push(i);
    }
    // next smaller left
    s= new Stack<>();//empty the stack
    for (int i = 0; i<arr.length; i++){
        
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
        }
        //2 if- else
        if(s.isEmpty()){
           nsl[i] = -1;
        }
        else{
           nsl[i] = arr[s.peek()];
        } 
    s.push(i);
}
//current area
for(int i =0; i<arr.length; i++){
    int heigth= arr[i];
    int width = nsr[i]- nsl[i]-1;
    int currArea = heigth * width;
    maxArea = Math.max(currArea, maxArea);
}
System.out.println(maxArea);

    }
}
