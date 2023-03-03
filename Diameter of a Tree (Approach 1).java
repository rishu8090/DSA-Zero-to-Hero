public class App {

    static class Node{
        int data;
        Node left , right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       int height = Math.max(leftHeight , rightHeight)  + 1;
       return height;
    }

    public static int diameter(Node root){            //  T.C. = O(N^2);
        if(root == null){
            return 0;
        }

        int leftDia = diameter(root.left);   // 1st
        int leftHeight = height(root.left);
        int rightDia = diameter(root.right);  // 2nd
        int rightHeight = height(root.right);

        int rootDia = leftHeight + rightHeight + 1;  // 3rd

        int realDiameter = Math.max(rootDia , Math.max(leftDia, rightDia));

        return realDiameter;
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

         System.out.println(diameter(root));
    }
}
