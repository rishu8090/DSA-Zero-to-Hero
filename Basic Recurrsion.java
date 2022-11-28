import javax.swing.plaf.synth.SynthButtonUI;

public class App {
    
    public static void Printdec(int n){
        if(n == 1){
            System.out.println(1);
           return;
        }
     System.out.print(n + " ");
      Printdec(n-1);
    } 
    // public static void PrintInc(int n){
    //     if(n == 10){
        //         System.out.print(10);
        //         return;
    //     }
    //     System.out.print(n + " ");
    //     PrintInc(n+1);
    // }
    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(1 +" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
    }

    public static int Fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = Fact(n -1);
        int fact = n * fnm1;
        return fact;
    }
    public static int sum(int n){
        if( n == 1){
            return 1;
        }
        int snm1 =sum(n -1);
        int sum = n + snm1;
        return sum;
    }

    public static int fibo(int n){
        if(n == 1 || n==2){
            return n;
        } 
        int fiboNM1 = fibo(n -1);
        int fiboNM2 = fibo(n-2);
        int fibo = fiboNM1+ fiboNM2;
        return fibo;
    }
    public static boolean isSorted(int arr[] , int i){  
        if( i == arr.length -1){     // i is the sttarting index for from where sorting wants
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return isSorted(arr ,i +1 );
    }
    public static int FirstOuccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if( arr[i] == key){
            return i;
        }
      return  FirstOuccurence(arr, key, i+1);
    
    }
    public static int LastOuccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        } 
        int isFound =  LastOuccurence(arr, key, i+1);
        if(  arr[i] == key && isFound == -1 ){
            return i;
        }
        return isFound;
    }
    public static int powOfN(int x, int n){
        if(n == 0){
            return 1;
        }
        int recurrsiveF = powOfN( x,  n-1);
        int ans = x * recurrsiveF;
        return ans;
    }
    public static int optimiszedPower(int x, int n ){
        if(n == 0){
            return 1;
        }
      int halfPower = optimiszedPower(x, n/2);
      int ans = halfPower *halfPower;
      if(n % 2 != 0){
          ans = x * halfPower * halfPower;
      }
      return ans ;
    }
    public static int TilingProb(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int verticalWays = TilingProb(n-1);
        int horizontalWays = TilingProb(n-2);
        int totalWays = (verticalWays + horizontalWays);
        return totalWays;
    }
    public static void removeDublicate(String str,int index,StringBuilder newStr, boolean map[]){
        if(index == str.length()){
           System.out.println(newStr);
            return;
        }
        // work
        char currchar = str.charAt(index);
        if(map[currchar - 'a'] == true){
            // duplicate
            removeDublicate(str, index +1, newStr, map);
        }else{
            map[currchar - 'a'] = true;
            removeDublicate(str, index +1 , newStr.append(currchar), map);
        }
    }
    public static int FriendsPairingProb(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int SingleWays = FriendsPairingProb(n-1);
        // (n-1) = first pairing choice;  f(n-2) = after first pairing then pairing choice;
        int PairWays = (n-1) * FriendsPairingProb(n-2);
        int TotalWays = SingleWays + PairWays;
        return TotalWays;
    }
    public static void BinaryString(int n, int lastDigit, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lastDigit == 0){                                 // you can also use this for small code.
            BinaryString(n -1, 0, str+"0");      //  BinaryString(n -1, 0, str+"0"); 
            BinaryString(n-1, 1 , str+"1");      //  if(lastDigit == 0){
        }else{                                             //       BinaryString(n-1, 1 , str+"1"); 
           BinaryString(n-1, 0, str+"0");      // }       
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int x = 2;
        int n=5;
        int key = 5;
        int i = 0; 
    //    int arr[] = {1,2,3,4,5};
      int arr[] = {8,3,6,9,5,10,2,5,9};
      // String str = "apnarishuchoudhary";
       StringBuilder newStr = new StringBuilder("");
       String str = new String ("");
      //  Printdec(n);
      //  PrintInc(n);
    //    System.out.print( Fact(n));
    //    System.out.print(sum(n));
    //    System.out.print(fibo(n));
     //   System.out.print(isSorted(arr , 0));
    //    System.out.print(FirstOuccurence(arr, key, 0 ));
    //    System.out.print(LastOuccurence(arr, key, 0   ));
     //   System.out.print(powOfN(2 ,10));
    //    System.out.print(optimiszedPower(2,10));
    //    System.out.print(TilingProb(4));
    //    removeDublicate(str, 0, newStr,new boolean[26]);
    //    System.out.print(FriendsPairingProb(7));
       BinaryString(3, 0,str);

    }
}
