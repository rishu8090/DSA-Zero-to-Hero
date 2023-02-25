import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin,Comparator.reverseOrder()); // gives reverse order of coin[]
        int countOfCoins = 0;
        int amount = 590;

        ArrayList <Integer> ans = new ArrayList<>();

        for(int i = 0; i < coin.length; i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    countOfCoins++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println( "Min no. of coins are: " + countOfCoins);
        System.out.println("The coins are used to give amount " +ans);

    }
}
