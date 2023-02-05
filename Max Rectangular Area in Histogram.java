import java.util.*;
public class App {

    public static void MaxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        
        // Step 1 : Find next Smaller right.
        Stack<Integer> s = new Stack<>();
        
        for(int j = arr.length-1; j >= 0 ; j--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[j]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[j] = arr.length;
            }else{
            nsr[j] = s.peek();
            }
            s.push(j);
        }

        // Step 2 : Find next Smaller left.
         s = new Stack<>();
        
        for(int i =  0; i < arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
       
        // Step 3 : Find current area.
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;  // width = j-i-1;   // nsr[j] -nsl[i] -1
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println( "Maximum area of Histogram is: " + maxArea);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int arr[] = {2,1,5,6,2,3};
         MaxArea(arr);
    }
}
