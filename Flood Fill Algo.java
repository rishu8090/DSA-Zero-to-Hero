import java.util.*;
public class App {

        public static int[][] floodFill(int[][] image, int sr, int sc, int color) 
        {
            if(image[sr][sc] == color)
                return image;
            
            helper(image , sr , sc , image[sr][sc],color);
            return image;
        }
        
        public static void helper(int[][] image , int current_row , int current_column , int color, int new_color){
            if(current_row < 0 || current_column < 0 || current_row >= image.length || current_column >= image[0].length || image[current_row][current_column] != color){
                return;
            }
                image[current_row][current_column] = new_color;
            
            //going up
                helper(image , current_row-1 , current_column , color, new_color);
            
            //going right
                helper(image , current_row , current_column+1 , color, new_color);
            
            //going down
                helper(image , current_row+1 , current_column , color, new_color);
            
            //going left
                helper(image , current_row , current_column-1 , color, new_color);
            
        }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int [][] image ={{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image,1,1,2);
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
