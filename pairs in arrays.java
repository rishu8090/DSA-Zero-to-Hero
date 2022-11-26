import java.util.*;
public class App {
    public static void pairsArray(int array[]){
       int total = 0;
        for(int i = 0; i < array.length; i++){
            int current = array[i];
            for(int j = i+1; j <  array.length; j++){
                System.out.print("(" + current + "," + array[j] + ")");   
                total++;
            }
            System.out.println();
        }
        System.out.print("total no. of pairs:" + total);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int array[] = { 1, 3,4,6,7,8,10};
       pairsArray(array);
}
}
