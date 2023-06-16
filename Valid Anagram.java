import java.util.*;
public class App {

    public static boolean isAnagram(String s , String t){
            if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){       // Adding in hashMap for comparison
            char ch = s.charAt(i);              
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }                                   // if exist ch them increament, either not exist use defaultvalue(0).

        for(int i = 0; i < t.length(); i++){     // Removing from hashMap after comparison.
            char ch = t.charAt(i);
             if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) -1);
                }
              }
            }
            return map.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String s = "race";
        String t = "acer";

        System.out.println(isAnagram(s, t));
    }
}
