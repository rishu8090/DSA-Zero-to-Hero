import java.util.*;
public class App {
    public static void SpiralArray(int matrix[][]){
        int stRow = 0;
        int endRow = matrix.length -1;
        int stCol = 0;
        int endCol = matrix[0].length -1;
        while(stRow <= endRow && stCol <= endCol){
            // top
            for(int j = stCol; j <= endCol; j++){
                System.out.print(matrix[stRow][j] +" ");
            }
            // right
            for(int i =stRow +1; i <= endRow; i++ ){
                System.out.print(matrix[i][endCol] +" ");
            }
            // bottom
            for(int j = endCol -1; j >= stCol; j--){
                if(stRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] +" ");
            }
            //left
            for(int i = endRow -1; i >= stRow +1; i--){
                if(stCol == endCol){
                    break;
                }
                System.out.print(matrix[i][stRow]+" ");
            }
            stRow++;
            endRow--;
            stCol++;
            endCol--;
        }
     //   System.out.println();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int matrix[][] = { {1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16},
                            {17,18,19,20} };
       SpiralArray(matrix);              
    }
}
