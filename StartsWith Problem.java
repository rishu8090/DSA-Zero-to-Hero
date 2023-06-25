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

    public static boolean startsWith(String prefix){ // O(L)
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) -'a';
            if(curr.children[idx] == null){
                return false;
            }
                curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String words[] ={"apple" , "app" ,"mango" ,"man" ,"woman"};
        String prefix = "app";
        String prefix2 = "moon";

          for(int i = 0; i < words.length; i++){
          insert(words[i]);
         }
        System.out.println(startsWith(prefix));
        System.out.println(startsWith(prefix2));
    }
}

