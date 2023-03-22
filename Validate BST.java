
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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean isValidBST(Node root, Node min, Node max){ // By approach 2.
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left , min , root)
            && isValidBST(root.right , root , max);
    }
    

   public static void main(String[] args) throws Exception {
       System.out.println("Hello, World!");
       int values[] = {8, 5, 3, 6, 10, 11, 14};
       Node root = null;

       for(int i = 0; i < values.length; i++){
           root = insert(root, values[i]);
       }

       inOrder(root);
       System.out.println();

       if(isValidBST(root, null, null)){
        System.out.print("Valid");
       }else{
        System.out.print("Invalid");
       }
      /*   Also this question can be solved by , approach 1 
            you can use inorder traversal,
            if inorder traversal gives you a sorted array, 
            if means it is a VALID BST or Not.
      */ 
      
   }
}
