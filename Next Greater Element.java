import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {6,8,0,1,2};
        Stack <Integer>  s = new Stack<>();
        int nxtGreater[] = new int[arr.length];                       //        T.C. -> O(n)
                                                                     //   you can also find . 
        for(int i = arr.length-1 ; i >= 0; i--){                    //   next greater right
            // Step 1 - while loop.                                //  next greater left.
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){       //  next smaller right 
                s.pop();                                         //  next smaller left.
            }
            // Step 2 - if else 
            if(s.isEmpty()){ 
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            // Step 3 - push.
            s.push(i);
        }

        for(int i = 0; i < nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
    }
}
