public class App {

    public static boolean StairCaseSorting(int matrix[][], int key){
        int row =matrix.length -1, col = 0;
    while( row < matrix.length && col >= 0){
        if( matrix[row][col] == key){
            System.out.println("key found at index"+"(" +row+ ","+ col+ ")");
            return true;
        }  else if ( key < matrix[row][col]){
            row--;
        }else{
            col++;
        }  
      }
       System.out.println("key not found");
      return false;
    }
    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16} };
           
          int key = 10;
          System.out.print(StairCaseSorting(matrix, key));
    }
}
