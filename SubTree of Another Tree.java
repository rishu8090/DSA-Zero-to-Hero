public class App {

    static class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node , Node Subtree){
        if(node ==  null && Subtree == null){
            return true;                              // Is Identical follows 
        }else if(node == null || Subtree == null){  // step 1 -> if any one of this becomes equals to null.
            return false;
        }else if(node.data != Subtree.data){      // step 2 -> if node's data not equals to subtree's data
            return false;
        }

        if(!isIdentical(node.left , Subtree.left)){      // step 3 -> same step 1 and 2 for left tree.
            return false;
        }
        if(!isIdentical(node.right , Subtree.right)){    // step 4 -> same step 1 and 2 for right tree.
            return false;
        }

        return true;
    }
     
    public static boolean isSubTree(Node root , Node Subtree){
        if(root == null){
            return false;
        }

        if(root.data == Subtree.data){      // step -> 1
            if(isIdentical(root, Subtree)){//  step -> 2
                return true;
            }
        }

        boolean leftAns = isSubTree(root.left , Subtree);
        boolean rightAns = isSubTree(root.right, Subtree);
        return leftAns || rightAns ;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         *           1
         *         /  \
         *        2    3
         *       / \  / \
         *      4   5 6  7
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
         /*
          *          2
          *         /  \
          *        4    5
          */
          Node Subtree = new Node(2);
          Subtree.left = new Node(4);
          Subtree.right = new Node(5);

          System.out.println(isSubTree(root, Subtree));
    }
}
