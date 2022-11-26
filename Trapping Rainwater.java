import java.util.*;
public class App {

    public static int rainwater(int array[]){
        int n = array.length;
        // Step 1: to find left max no.
        int leftMax[] = new int[n];
        leftMax[0] = array[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i -1], array[i]);
        }
        // Step 2: to find right max no.
        int rightMax[] =new int[n];
        rightMax[n -1] = array [ n -1];
        for(int i = n -2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1] , array[i]);
        }
        int trappedWater = 0;
        // Step 3: loop.
        for(int i = 0; i < n; i++){
            // Step 4: calculate waterlevel.
            int waterLevel = Math.min(leftMax[i] ,rightMax[i]);
            // Step 5; calculate  total trapped water.
            trappedWater += waterLevel - array[i];       
         }
         return trappedWater;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = {4,1,3,6,2,3,5};
       System.out.println(rainwater(array));  
    }
}
