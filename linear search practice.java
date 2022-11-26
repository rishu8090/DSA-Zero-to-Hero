import java.util.*;
public class App {

    public static String linearSearch (  String marks[] , String key){
        for( int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         String marks[] = { " aloo puri" , "chole" , "rajma chawal" , "idli" , " dosa" };
         String key =  "dosa";
        int index = linearSearch(marks, key);
        if( index == -1){
            System.out.print(" Not found ");
        }else{
            System.out.print("key found at index :" + index);
        }
        
    }
}
