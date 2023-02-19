import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int val[] = {60,100,120};
        int weigth[] = {10,20,30};
        int W = 50;

        double ratio[][]= new double[val.length][2];    // ratio  =  val / weigth

        // 0th coloum = index ; 1th coloum = ratio;
        for(int i =0; i < val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/ (double)weigth[i];
        }

        // Sort according ratio. -> assending order.
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));  // [4,5,6]

        int capacity = W;
        int finalVal = 0;
        for(int i = ratio.length-1; i >= 0 ; i--){  // here ratio is used in [ 6,5,4]
            int idx =(int) ratio[i][0];
            if(capacity >= weigth[idx]){   // include full item.
                finalVal += val[idx];
                capacity -= weigth[idx];
            }else{
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value is:" + finalVal);
    }
}
