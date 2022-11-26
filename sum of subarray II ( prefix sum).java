import java.util.*;
public class App {
    public static void sumSubArrII(int array[]){

        int prefix[]= new int[array.length] ;
         prefix[0] = array[0];
         int currSum = 0;
         int maxSum = Integer.MIN_VALUE;
         System.out.println(prefix[0]);
        // not good in space complexibility bcz of creating prefix array.
        //  for calculating prefix array.
        for(int i = 1; i < prefix.length; i++){ 
            prefix[i] = prefix[i -1] + array[i];          
            System.out.println(prefix[i] + " " ); // prints your prefix array.
        }
          
        for(int i = 0; i < array.length; i++ ){
            int start = i;
            for(int j = i; j < array.length; j++){
                int end = j;
               // ternary operator
                currSum = start == 0 ? prefix[end] : prefix[end] -prefix[start -1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("and the Max Sum is:" + maxSum);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = { 1,-1,3,4,6,-2,5};
        sumSubArrII(array);
    }
}
