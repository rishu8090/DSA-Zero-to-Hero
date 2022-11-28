public class App {
    public static boolean isSafe(int Sudoku[][],int row,int col,int digit){
        //column
        for(int i = 0; i <9 ;i++){
            if(Sudoku[i][col] == digit){
                return false;
            }
        }
            // row
            for(int j = 0; j<9; j++){
            if(Sudoku[row][j] == digit){
                return false;
            } 
        } 
        // grid
        int sr = (row/3) *3;
        int sc = (col/3) *3;
        // 3x3 grid,
         for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3 ; j++){
                if(Sudoku[i][j] == digit){
                    return false;
                }
            }
         }
         return true;
    }
    public static boolean SudokuSolver( int Sudoku[][],int row,int col){
        //base
        if(row == 9){
            return true;
        }
        
        // Recurrsion
        int nextRow = row  ; int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
           nextCol = 0;
        }

        if(Sudoku[row][col] != 0){    /// this condition is used for already sets elements, 
            return SudokuSolver(Sudoku,nextRow,nextCol); /// which you can't be removed.
        }

        for(int digit = 1;digit<= 9; digit++){
            if(isSafe(Sudoku,row,col,digit)){
                Sudoku[row][col] = digit;
               if(SudokuSolver(Sudoku,nextRow,nextCol)){ // here,true if soln exist,
                return true;
            }
            Sudoku[row][col] = 0;
        }
      }
      return false;
    }

    public static void PrintSudoku(int Sudoku[][]){
        for(int i = 0; i<9; i++){
            for(int j =0; j< 9; j++){
                System.out.print(Sudoku[i][j] + " " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int Sudoku[][] = { {0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,2,0,0,6,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {5,2,7,0,0,9,0,1,3} };
        if(SudokuSolver(Sudoku, 0,0)){
            System.out.println("Solution is exist");
            PrintSudoku(Sudoku);
        }else{
            System.out.print("Solution is not exist");
        }           
    
}
}