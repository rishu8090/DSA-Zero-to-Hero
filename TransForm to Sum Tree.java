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

    public static int TransFormToSumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = TransFormToSumTree(root.left);
        int rightSum = TransFormToSumTree(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;    // this two cases will occur when we are at the leaf node of tree,
        int newRight = root.right == null ? 0 :root.right.data; // , and can't find our leftsum or rightsum data.

        root.data =  newLeft+ leftSum +newRight + rightSum;
        return data;
    }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
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

        TransFormToSumTree(root);
        preOrder(root);
       // System.out.println(root.data);
    }
}
