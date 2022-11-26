import java.util.*;
public class App {

    // not good in time complexibility bcz of 3 loops. 

    public static void sumSubArrI(int array[]){
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
          int start = i;
          for(int j = i; j < array.length; j++){
            int end = j ; 
            current = 0;
            for(int k = start; k <= end; k++){
                 current += array[k];
            }
            System.out.println(current);
            if( current > maxSum){
                maxSum = current;
            }
          }
        }
        System.out.println( " and max. sum of subarrays :" + maxSum);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = {1,2,-2,5,7,4,-1};
        sumSubArrI(array);
    }
}
