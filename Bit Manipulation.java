import java.util.*;
public class App {

    public static void oddOReven(int n){
     int bitmask = 1;
     if( (bitmask & n) == 0){
        System.out.print("even");
     }else{
        System.out.print("odd");
     }
    }

    public static int GetithBit(int n, int i){
        int bitmask = 1<<i;
        if((bitmask & n) == 0){
            return 0;
        }else{ 
            return 1;
        }
        }

        public static int SetithBit(int n, int i){
            int bitmask = 1<<i;
        return( n| bitmask);
        }

        public static int ClearithBit(int n, int i){
            int bitmask = ~(1<<i);
            return(bitmask & n);
        }

        public static int UpdateithBit(int n , int i ,int newBit){
            if(newBit == 0){
              return  ClearithBit(n,i);
            }else{
              return  SetithBit(n,i);
            }    
        }

        public static int ClearLastithBits(int n , int i){
            int bitmask = (~0)<<i;
            return (n & bitmask);
       }

       public static int ClearRangeofBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
       }

       public static boolean powerofTwo(int n){ // is a no.power of two or not?
        if( (n & (n-1) )== 0){
            return true;
        }else{ 
            return false;
        }
    }

    public static int CountSetithBits(int n){
        int count = 0;
        while(n > 0){
            if( (n & 1) != 0){     // here checks LSB
                count++;
            }
            n = n>>1;
        }  
        return count;
    }

      public static int FastExponentiation(int n, int a){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans =  ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void SwapNo(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.print("After swap:" + "a " + a + " b " + b);
    }
    
     
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // oddOReven(4);
       // System.out.println(GetithBit(10, 3));
      //  System.out.print(SetithBit(10,2));
    //    System.out.print(ClearithBit(10,1));
      //  System.out.print(UpdateithBit(10,2,1));
    //    System.out.print(ClearLastithBits(10,2));
     //   System.out.print(ClearRangeofBits(127,2,5));
    //    System.out.print(powerofTwo(31));
   //     System.out.print(CountSetithBits(10));
    //    System.out.print(FastExponentiation(3,5));
     //   SwapNo(3,4); 
          System.out.print(FastExponentiation(5,3)); 
    
    }
}
