import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int n = 4 , m = 6 ;  // n = horizontal  ,  m = vertical
        Integer verCost[] = {2,1,3,1,4}; // m-1
       Integer horiCost[] = {4,1,2};    //  n-1

       Arrays.sort(verCost , Collections.reverseOrder());  // {4,3,2,1,1};
       Arrays.sort(horiCost, Collections.reverseOrder()); //  {4,2,1};
       
       int h = 0 , v = 0;  // h = horizontal cut  ;  // v = vertical cut ;
       int hp = 1 , vp = 1; //  hp = horizontal pieces.   //  vp  = vertical pieces
                           // In Starting, chocolate have only 1 row and 1 coloum.
       int cost = 0;
        while( h < horiCost.length && v < verCost.length){
            if(horiCost[h] <= verCost[v]){  // vertical cut.
                cost += (verCost[v] * hp);
                vp++;
                v++;
            }else{                         // horizontal cut.
                cost += (horiCost[h] * vp);
                hp++;
                h++;
            }         
        }
        while(h < horiCost.length){    /// if any left over horizontal cuts.
            cost += (horiCost[h] * vp);
            hp++;
            h++;
        }

        while(v < verCost.length){     // if any left over vertical cuts.
            cost += (verCost[h] * hp);
            vp++;
            h++;
        }
        
       System.out.println(" Min cost of cutting:"+ cost);
    }
}
