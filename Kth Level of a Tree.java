public class App {

    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void KthLevel(Node root, int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        KthLevel(root.left ,level+1,k);
        KthLevel(root.right,level+1,k);
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

         int k = 3;
         KthLevel(root, 1 , k);
    }
}
