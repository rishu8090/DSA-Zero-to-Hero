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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        int totalNodes = (leftCount + rightCount) + 1;
        return totalNodes;
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

         System.out.println(countNodes(root));
    }
}
