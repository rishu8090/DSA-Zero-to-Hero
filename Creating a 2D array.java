import java.util.Scanner;
public class App {
     
     // Searching in a matrix.
     public static boolean Search( int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
                 if( matrix[i][j] ==key ){
                    System.out.print("key found at index" + "(" + i + "," + j+ ")");
                    return true;
                 }
            }
          }
          System.out.print("Key not found.");
          return false;
        }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int matrix[][] = new int [3][3];
      //  int n = matrix.length , m = matrix.length;
        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = scn.nextInt();           
             }      
        }
        // for printing output.
        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, 4);
       
     }
  }
