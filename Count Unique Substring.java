import java.util.*;
public class App {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false; // eow = end of word.
        
        Node(){
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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(root.children[i] !=  null){
             count +=   countNodes(root.children[i]);
            }
        }
        return count+1; // here,like BST or BT, we add 1 for counting self node at each level.
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str = "ababa" ;
         for(int i = 0; i < str.length(); i++){
         String suffix = str.substring(i);  // 1.find suffix -> SubString of str start from i.
         insert(suffix);                // 2. create tries and insert suffix.
         }    

           System.out.println(countNodes(root)); // 3. count nodes of tries.
    }
}

// Unique substring is always equals to the all prefixs of all suffix.