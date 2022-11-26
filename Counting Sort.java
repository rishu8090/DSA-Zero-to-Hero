import java.util.*;
public class App {

    public static void CountingSort(int array[]){
        // write your code here.
        int largest = Integer.MIN_VALUE;
        for(int i =0; i < array.length; i++){
            largest = Math.max(largest,array[i]);
        }

        int count [] = new int[largest +1];
         for(int i =0; i < array.length; i++){
            count[array[i]]++;
         }
         
         //Sorting
         int j =0;
         for(int i =0; i < array.length; i++){
            while(count[i] >0){
                array[j] = i;
                j++;
                count[i]--;
            }
         }
    }

    public static void printArray(int array[]){
        for(int i =0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = { 2,4,1,3,2,6,3};
        CountingSort(array);
        printArray(array);
    }
}
