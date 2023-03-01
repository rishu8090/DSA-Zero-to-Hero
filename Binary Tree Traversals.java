import java.util.*;
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
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
        if( nodes[idx] == -1){
            return null;   
        }
        Node newNode = new Node( nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
     }
    
 //                                                                       // this next three traversal methods are known as 
    public static void preOrder(Node root){                              //   Depth First Search (DFS) 
        if(root == null){                            // In preorder traversal, 
           // System.out.print(-1 + " ");           //  First traverse  Root
            return;                                //   Then Left Node of root and its elements 
        }                                         //    And Lastly Right Node of root and its elements.
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);                   // O(n).
    }


    public static void inOrder(Node root){
        if(root == null){                            // In inorder traversal, 
            return;                                 // First traverse  left Node of root and its elements
        }                                          //  Then prints root's data.
        inOrder(root.left);                       //  And Lastly Right Node of root and its elements.
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;                                 // in Postorder traversal,
        }                                          //  First Traverse left node of root and its elements.
        postOrder(root.left);                     //   then traverse right node of root and its elements.
        postOrder(root.right);                    // and lastly prints root's data.
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root){                  
        if(root == null){                                       //  O(n)
            return;
        }                                                       // this traversal method is known as ,
     //                                                        //  Breath First Search (BFS).
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();  
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                } 
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
}
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
      //  System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
       //  tree.postOrder(root);
         tree.levelOrder(root);
    }
}
