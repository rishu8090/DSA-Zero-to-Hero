
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

    public static int HeightTree(Node root){
        if(root == null){
            return 0;
        }
           int LeftHeight = HeightTree(root.left);
           int RightHeight = HeightTree(root.right);
         int totalHeight =   Math.max(LeftHeight,RightHeight) + 1; 
         return totalHeight;
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

         System.out.println(HeightTree(root));
    }
}
