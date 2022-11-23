 import java.util.*;
import java.util.Scanner;
public class App {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     public static void hollow_rectangle( int rows , int cols){   
        for( int i = 1; i <= rows; i++){
            for (int j = 1; j <= cols ; j++){
                if( i == 1 || i == rows || j == 1 || j == cols ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
     
    // 2nd quadrant triangle
    public static void triangle(int n){
        int space = n-1;
        int star = 1;
        for(int i = 1; i <= n ; i++ ){
            for(int j =1 ; j <= space ; j++){
                System.out.print("\t");
            }for(int j = 1 ; j <= star ; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
    // 4th quadrant triangle
    public static void inverted_triangle(int n){
        for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= n-i+1 ; j++){
                // if we print j , then it prints same no. in coloum
                System.out.print( j);      
            } 
            System.out.println();  
        }   
    }


    public static void floadtriangle(int n){
        int var = 1;
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(var + " ");
                var++;
                //  if we print like this , then no. increases in row and coloum . 
                // if we run this code for 4 ,then it print a triangle which no.s goes from 1 to 10.
            }
            System.out.println();
        }

    }
        // 1st quadrant;  for print a triangle 0 and 1 
    public static void ZeroOnetriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterlfy_pattern( int n){
         //for 1st half
        for( int i = 1; i <= n; i++){
            int star =i;
            int space = 2*( n-i );
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            } for(int j =1; j <=  space; j++){
                System.out.print("\t");
            }for(int j =1; j<= star; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        // for 2nd half
        for(int i = n; i >= 1 ; i--){
            int star =i;
            int space = 2*( n-i );
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            } for(int j =1; j <=  space; j++){
                System.out.print("\t");
            }for(int j =1; j<= star; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }  
    }
        //   solid rhombus having same rows and coloum.
        public static void solid_rhombus( int n){
            for( int i = 1; i <= n; i++){
                int space = n - i;
                int star = n ;
                for( int j = 1; j <= space; j++){
                    System.out.print("\t");
                }for( int j = 1; j <= star; j++){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }

        public static void hollow_rhombus( int n){
            for(int i = 1; i <= n; i++){
                int space = n - i;
                int star = n;
                for(int j = 1; j <= space; j++){
                    System.out.print("\t");
                }for(int j = 1; j <= star; j++){
                    if (i == 1 || i == n|| j == 1 || j == n ){
                        System.out.print( "*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }

        
        public static void diamond_pattern( int n){
            // for 1st half
            for( int i =1; i <= n; i++){
                int space = n -i;
                int star = ( 2*i) -1;
                for(int j =1 ; j <= space ; j++){
                    System.out.print("\t");
                }for(int j = 1 ; j <= star ; j++){
                    System.out.print("*\t");
                }
               
                System.out.println();
            }
            // for mirror image of 1st half.
               for(int i = n; i >= 1; i--) {
                int space = n -i;
                int star = ( 2*i) -1;
                for(int j =1 ; j <= space ; j++){
                    System.out.print("\t");
                }for(int j = 1 ; j <= star ; j++){
                    System.out.print("*\t");
                }   
                System.out.println();
          }
        }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    //   hollow_rectangle(5,6);
    //   triangle(n);
    //   inverted_triangle(n);  
      // floadtriangle(n); 
    //   ZeroOnetriangle(n);
      // butterlfy_pattern(n);
     //  solid_rhombus(n);
    //   hollow_rhombus(n);
         diamond_pattern(n);
     }
}
