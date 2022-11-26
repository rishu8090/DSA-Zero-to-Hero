import java.util.*;
public class App {
    public static int GetLargest(int marks[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < marks.length; i++){
            if( largest < marks[i]){
                largest = marks[i];
            }
        }
        return largest;  
    }

    public static int getSmallest(int marks[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < marks.length; i++){
            if(smallest > marks[i]){
                smallest = marks[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int marks[] = {1,2,4,6,3,0,7};
        int largestNumber = GetLargest(marks);
        int smallestNumber = getSmallest(marks);
        System.out.println(" Largest no. in array: " + largestNumber);
        System.out.print("  smallest no. in array: " +  smallestNumber);  
    }
}
