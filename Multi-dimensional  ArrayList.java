import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<ArrayList<Integer>>  mainlist = new ArrayList<>();     // creating a main ArrayList;
        ArrayList<Integer> list1 = new ArrayList<>();   // creating a sub-ArrayList;
        ArrayList<Integer> list2 = new ArrayList<>();    // creating a sub-ArrayList;
        ArrayList<Integer> list3 = new ArrayList<>();     // creating a sub-ArrayList;

        for(int i = 1; i <= 5 ; i++) { 
           list1.add(i*1);          // adds no. in the sub-ArrayList;
           list2.add(i*2);          // adds no. in the sub-ArrayList;
           list3.add(i*3);          // adds no. in the sub-ArrayList;
        }

        mainlist.add(list1);         // adds sub-ArrayList in the main ArrayList;
        mainlist.add(list2);         // adds sub-ArrayList in the main ArrayList;
        mainlist.add(list3);         // adds sub-ArrayList in the main ArrayList;

        System.out.println(mainlist);     // prints the main ArrayList having sub-Arraylists;

        // nested loops
        for(int i = 0; i < mainlist.size(); i++){               // used to print sub-Arraylists
            ArrayList<Integer> currlist = mainlist.get(i);      // used to print sub-Arraylists
            for(int j = 0; j < currlist.size(); j++){            // used to print sub-Arraylists
                System.out.print(currlist.get(j) +" ");
            }
            System.out.println();
        }
        }
}
