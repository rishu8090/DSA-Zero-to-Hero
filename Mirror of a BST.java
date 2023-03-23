public class App {
     static class Node{
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

     public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     }

     public static Node Mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftImage = Mirror(root.left);
        Node rightImage = Mirror(root.right);

        root.left = rightImage; // assigns rightImage to left of the root.
        root.right = leftImage; // assigns leftImage to right of the root.
        return root;
     }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int values[] = {8, 5, 3, 6, 10, 11};
       Node root = null;
       

    /*                              ||
     *                8             ||           8
     *              /   \           ||         /   \
     *             5     10         ||        10    5
     *            / \      \        ||       /     /  \
     *           3   6      11      ||      11    6    3
     *                              ||
     *       // Orignal  Image                // Mirror Image
     */

       for(int i = 0; i < values.length; i++){
           root = insert(root, values[i]);
       }

       preOrder(root);
       System.out.println();

       Mirror(root);
       preOrder(root);
    }
}
