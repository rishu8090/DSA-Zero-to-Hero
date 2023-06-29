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

    public static String ans = "" ;
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i =0; i< 26; i++){ // a,b,c,d,e,f, .....  (due to this apple is ans not apply).
            if(root.children[i] != null && root.children[i].eow == true ){
                char ch = (char) (i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() -1);  // backtrack;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String words[] = {"a" ,"banana" ,"app" ,"appl" ,"ap" ,"apply" ,"apple" };
         for(int i = 0; i < words.length; i++){
          insert(words[i]);
         }

          longestWord(root,new StringBuilder(""));
          System.out.println(ans);
    }
}