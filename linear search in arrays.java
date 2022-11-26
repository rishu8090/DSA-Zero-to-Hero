import java.util.*;
public class App {

    public static int linear_search( int marks[], int key){
        for(int i = 0; i < marks.length; i++){
            if( marks[i] == key){
                 return i;
            } 
        }
         return -1;  
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int marks[] = { 2 , 5, 8, 10, 13, 15, 18, 31};
        int key = 33;
       int index = linear_search(marks, key);
       if( index == -1 ){
        System.out.println("  key not found ");
    }else{
        System.out.println(  " key is at index " + index);
    }
       System.out.print(index);

        
    }
}
