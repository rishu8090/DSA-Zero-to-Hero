public class App {

    public static int DiagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i =0; i <matrix.length; i++){
        //     for(int j =0; j < matrix.length; j++){
        //         if(i == j ){                          // O(n^2) optimised
        //             sum += matrix[i][j];
        //         }else if (i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }           
        //      }
        // }
        for(int i = 0; i < matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];
            // Secondary diagonal                    //O(n) optimised
            if (i != matrix.length-1-i)
            sum += matrix[i][matrix.length-1-i];  // i+j = n-1 ; j = n-1-i
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}  };
       System.out.print( DiagonalSum(matrix));
    }
}
