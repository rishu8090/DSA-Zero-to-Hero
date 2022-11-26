import java.util.*;
public class App {
     // the only and only condition for binary search is that the array's element
     //arraged in sorted manner;
    public static int binarySearch(int elements[] , int key){
      int start = 0, end = elements.length -1;
      while( start <= end){
        int mid = (start + end)/2; 
        if( elements[mid] ==  key){ // for when mid is equal to the key.
            return mid;
        }if(elements[mid] > key){ //for first half
            end =  mid -1;
        }else{                      // for 2nd half
            start = mid +1;
        }
      }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int elements[] = {1,2,3,4,5,6,7,8,9};
        int key = 6;
        int binary = binarySearch(elements , key);
        System.out.print( " And your index is : " + binary);
    }
}
