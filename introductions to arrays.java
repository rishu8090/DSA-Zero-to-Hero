import java.util.*;
public class App {
    // basic array operations = create , input , output , update.
    public static void update ( int marks[]){
        for( int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        int marks[] = { 75 , 84 ,34};
        update( marks );

        for(int i = 0; i < marks.length; i++){
            System.out.print( marks[i] + " ");
        }
        System.out.println();      
    }
}
