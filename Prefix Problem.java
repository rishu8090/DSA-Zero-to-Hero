import java.util.*;
public class App {
    static public class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;
        
        public Node(){
            for(int i = 0; i < children.length; i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                 curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }    
        curr.eow = true;
    }

    public static void FindpreFix(Node root, String ans){

        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i =0; i < root.children.length; i++){
            if(root.children[i] != null){
                FindpreFix(root.children[i], ans+(char)(i+'a'));
            }
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String arr[] = {"zebra" ,"dog" ,"duck" ,"donkey"};
        for(int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }
        root.freq = -1;

        FindpreFix(root, "");
    }
}
