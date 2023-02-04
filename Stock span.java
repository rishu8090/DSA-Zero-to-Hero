import java.util.*;
public class App {
     
    public static void stockSpan(int stock[] , int span[]){
        Stack <Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i < stock.length; i++){
            int currPrize = stock[i];
            while(!s.isEmpty() && currPrize > stock[s.peek()]){
                s.pop();
            } 
            if(s.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];

        stockSpan(stock , span);
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
