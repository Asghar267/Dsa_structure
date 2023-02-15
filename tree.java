public class BinaryTreeTest 
{ 
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
  
        tree.addNode(50); 
        tree.addNode(30); 
        tree.addNode(20); 
        tree.addNode(40); 
        tree.addNode(70); 
        tree.addNode(60); 
        tree.addNode(80); 
  
        tree.deleteNode(20); 
  
        System.out.println("Inorder traversal of the given tree"); 
        tree.display(); 
  
        System.out.println("\nSearch for node with key 60"); 
        tree.searchNode(60); 
    } 
}



class Node 
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    }


public class BinaryTree 
   { 
     Node root; 
 
     BinaryTree() 
     { 
         root = null; 
     } 
 
     void addNode(int key) 
     { 
         root = addNodeRec(root, key); 
     } 
 
     Node addNodeRec(Node node, int key) 
     { 
         if (node == null) 
         { 
             node = new Node(key); 
             return node; 
         } 
         if (key < node.key) 
             node.left = addNodeRec(node.left, key); 
         else if (key > node.key) 
             node.right = addNodeRec(node.right, key); 
         return node; 
     } 
 
     void deleteNode(int key) 
     { 
         root = deleteNodeRec(root, key); 
     } 
 
     Node deleteNodeRec(Node node, int key) 
     { 
         if (node == null) 
             return node; 
 
         if (key < node.key) 
             node.left = deleteNodeRec(node.left, key); 
         else if (key > node.key) 
             node.right = deleteNodeRec(node.right, key); 
 
         else
         { 
             if (node.left == null) 
                 return node.right; 
             else if (node.right == null) 
                 return node.left; 
 
             node.key = minValue(node.right); 
 
             node.right = deleteNodeRec(node.right, node.key); 
         } 
         return node; 
     } 
 
     int minValue(Node node) 
     { 
         int minv = node.key; 
         while (node.left != null) 
         { 
             minv = node.left.key; 
             node = node.left; 
         } 
         return minv; 
     } 
 
     void searchNode(int key) 
     { 
         searchNodeRec(root, key); 
     } 
 
     void searchNodeRec(Node node, int key) 
     { 
         if (node == null) 
             return; 
 
         if (node.key == key) 
         { 
             System.out.println("Node found"); 
             return; 
         } 
         if (node.key > key) 
             searchNodeRec(node.left, key); 
         else
             searchNodeRec(node.right, key); 
     } 
 
     void display() 
     { 
         inorderRec(root); 
     } 
 
     void inorderRec(Node node) 
     { 
         if (node != null) 
         { 
             inorderRec(node.left); 
             System.out.println(node.key); 
             inorderRec(node.right); 
         } 
     } 
 }
