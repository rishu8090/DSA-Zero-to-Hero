import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int pairs[][] = {{5,24} ,{39,60}, {5,28} ,{27,40} ,{50,90}}; 

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // (5,24) ,(5,28) ,(27,40) , (39,60) ,(50,90)

        int chainLen = 1; // here we added our 1st pair in answere.
        int chainLast = pairs[0][1];  // it is the last end of pairs 1st.

        for(int i = 1; i < pairs.length; i++){
            if(pairs[i][0] > chainLast){
                chainLen++;
                chainLast = pairs[i][1];
            }
        }
        System.out.println("Max chain length of pairs is: " + chainLen);
    }
}
