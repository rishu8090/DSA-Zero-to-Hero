public class App {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
     }


     public static Node insert(Node root ,int val ){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subTree insert.
            root.left = insert(root.left , val);
        }else{
            // right subtree insert.
            root.right = insert(root.right , val);
        }
        return root;
     }

     public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }

     public static boolean Search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
          return   Search(root.left , key);
        }else{
          return  Search(root.right , key);
        }
     }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int values[] ={5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);

       System.out.println(Search(root, 7));
       
       if(Search(root, 6)){
        System.out.print("Found");
       }else{
        System.out.print("Not Found");
       }
    }
}
