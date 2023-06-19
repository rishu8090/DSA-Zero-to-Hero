import java.util.*;
public class App {

    public static String getStart(HashMap<String , String> tickets){
        HashMap<String , String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key) , key);   //  To to From.
        }

        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;   // here we have find our starting point.
            }
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HashMap<String , String> tickets = new HashMap<>();   // from to To
        tickets.put("Chennai" , "Bangaluru");
        tickets.put("Mumbai" , "Delhi");
        tickets.put("Goa" , "Chennai");
        tickets.put("Delhi" , "Goa");

        String  starting = getStart(tickets);
            System.out.print(starting);
        for(String key : tickets.keySet()){
            System.out.print("->" + tickets.get(starting));
            starting = tickets.get(starting);
        }
            System.out.println();
    }
}
