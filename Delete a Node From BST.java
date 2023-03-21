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

     public static Node delete(Node root , int key){

        if(root.data > key){        // for search in left subtree. 
            delete(root.left , key); 
        }else if(root.data < key){  // for search in right subtree.
            delete(root.right , key);
        }
         else{  // if we are at deletion node.

            // Case 1 ->  Leaf node.
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2 -> Single Child Node
            if(root.left == null){
                return root.right;
            }else if(root.right ==  null){
                return root.left;
            }
            // Case 3 -> Both Children Node.
            Node InOrderSuccesor = findInOrderSucc(root.right); // inOrderSucc. is the left most Node in, 
              root.data = InOrderSuccesor.data;                // right Subtree of deleting Node.
             root.right = delete(root.right, InOrderSuccesor.data);
         }
         return root;
     }

     public static Node findInOrderSucc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
     }

      
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

         root = delete(root, 5);
        inorder(root);
    }
}
