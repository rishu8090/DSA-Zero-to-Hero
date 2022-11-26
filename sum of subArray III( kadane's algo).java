import java.util.*;
public class App {
    // good in both time and space complexbility. but you have to apply special 
    // condition for array in which all memebers are -ve.
    public static void sumSubArrIII(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < array.length; i++){
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("and our max.Sum is :"  + maxSum);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = {-2 ,-3, 5,1,-1,4,3,-2};
        sumSubArrIII(array);
    }
}
