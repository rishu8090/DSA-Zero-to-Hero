import java.util.*;
public class App {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++ ){
            if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice; // today's profit if we sell stocks today.
           maxProfit =  Math.max(profit, maxProfit);
        }else{
            buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int prices[] = {4,1,2,4,5,4};
       System.out.println(buyAndSellStocks(prices)) ;
}
}