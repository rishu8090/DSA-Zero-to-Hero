import java.util.*;
public class App {

    public static void subarrays(int array[]){
        int total = 0;
        for(int i = 0; i < array.length ; i++){
            int start = i;                           // for starting of subarray.
            for(int j = i; j < array.length ; j++){
                int end = j;                         // for ending of subarray.
                for(int k = start; k <= end; k++ )   {
                    System.out.print( array[k] + " " );
                } 
                total++;
                System.out.println();                    
            }
            System.out.println();
        }
        System.out.print(" Total no. of subarrays" + total); // no. of subarrays is equals to  {n(n+1)/2}.
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = {1,3,5,6,8,11,13};
        subarrays(array);
    }
}
