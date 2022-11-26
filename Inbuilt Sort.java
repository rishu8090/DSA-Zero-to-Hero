import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class App {

    public static void printArray(Integer array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       //  int array[] = { 5,3,1,4,2};
       //  Arrays.sort(array);
       //  Arrays.sort(array,0,3);
       
       Integer array[] = { 5,3,1,4,2};
        //  Arrays.sort(array,Collections.reverseOrder());
         Arrays.sort(array, 0,3,Collections.reverseOrder());
        printArray(array);
    }
}
