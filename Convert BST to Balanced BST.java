import java.util.*;
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
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
        public static void getInorder(Node root , ArrayList<Integer> inorder){

            if(root == null){
                return;
            }

            getInorder(root.left , inorder);
            inorder.add(root.data);
            getInorder(root.right, inorder);
        }

        public static Node createBST(ArrayList<Integer> inorder , int start , int end){
            
            if(start > end){
                return null;
            }
            int mid = (start + end)/2;
            Node root = new Node(inorder.get(mid));

            root.left = createBST(inorder, start, mid -1);
            root.right = createBST(inorder, mid+1, end);

            return root;
        }
        public static Node balancedBST(Node root){
            // inorder seq
            ArrayList<Integer> inorder = new ArrayList<>();
            getInorder(root, inorder);
            // sorted inorder -> balanced BST
            root = createBST(inorder, 0, inorder.size() -1);
            return root;
        }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*
         *          Original BST is:
         *                    8
         *                   / \
         *                  6   10
         *                 /      \
         *                5        11
         *               /          \
         *              3            14
         */
        Node root = new Node( 8);
        root. left = new Node( 6);
        root. left. left = new Node( 5);
        root. left. left. left = new Node( 3);
        root.right = new Node( 10);
        root.right.right = new Node( 11);
        root.right.right.right = new Node(14);

        /*
         *    Expected BST is:
         *             8              
         *           /  \
         *          5    11
         *         / \   / \
         *        3   6  10 14
         */

         root =  balancedBST( root);
         preOrder(root);
    }
}
