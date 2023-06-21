import java.util.*;
public class App {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; // eow = end of word.
        
        Node(){
            for(int i = 0; i < 26; i++){     // in its constructor, does'nt have parameters bcz we 
                children[i] = null;         // does'nt have to track data value whereas we track data 
            }                              //  by its array's index.
        }
    }

    public static Node root = new Node ();

    public static void insert(String words){
        Node curr = root;
        for(int level = 0; level < words.length(); level++){
            int idx = words.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
                curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

                curr = curr.children[idx];        
        }
        return curr.eow == true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String words[] = {"the" ,"a", "there" , "any" , "their" , "any" ,"thee" };
         for(int i = 0; i < words.length; i++){
          insert(words[i]);
         }

         System.out.println(search("thee"));
         System.out.println(search("thor"));
    }
}
