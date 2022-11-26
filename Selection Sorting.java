import java.util.*;
public class App {

    public static void SelectionSort(int array[]){
        // here = i is equal to turn.
        for(int i = 0; i < array.length -1; i++){
            int minPos = i;
            for(int j = i+1; j < array.length ; j++){
                if(array[minPos] > array[j]){ // here changing the sign of operator you can write des. order.
                    minPos =  j;
                }
            }
            //swap
            int temp = array[minPos];
           array[ minPos] = array[i];
            array[i] = temp;
        }
    }
    public static void printSortedArray(int array[]){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = {5,4,1,3,2};
        SelectionSort(array);
        printSortedArray(array);
    }
}
