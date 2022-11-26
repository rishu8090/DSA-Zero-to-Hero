import java.util.*;
public class App {

    public static void reverse(int numbers[]){
        int start = 0, end = numbers.length -1 ;
        while(start < end){
            // swap no.
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]  = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numbers[] = {2,3,5,6,7,8,18 ,31,46};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
