import java.util.*;
public class App {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; // eow = end of word.
        
       public Node(){
            for(int i = 0; i < 26; i++){     // un its constructor, does'nt have parameters bcz we 
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

        public static boolean wordBreak(String key){

            if(key.length() == 0){
                return true;
            }
            for(int i = 1; i<= key.length(); i++){
                if(search(key.substring(0,i))       // first string (0 to i)
                 && wordBreak(key.substring(i))){  // second string (i to n)

                    return true;
                }
            }
            return false;
         }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String words[] = {"i" , "like" , "sam" ,"samsung" ,"mobile" ,"ice" };
         for(int i = 0; i < words.length; i++){
          insert(words[i]);
         }

        //  System.out.println(search("sam"));
        //  System.out.println(search("sung"));

        String key = "ilikesamice";
        System.out.println(wordBreak(key));
    }
}

