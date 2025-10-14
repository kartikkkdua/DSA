public class PrintRangeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key ){
        if(root == null) return false;
        if(root.data == key) return true;
        if(key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    public static Node delete(Node root, int val){
        if(root == null) return null;

        if(val < root.data){
            root.left = delete(root.left, val);
        } else if(val > root.data){
            root.right = delete(root.right, val);
        } else {
            // found node to delete
            // case 1: leaf
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2: one child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            // case 3: two children - replace with inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            // delete the inorder successor node from right subtree
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1 , int k2){
        if(root == null) return;
        if(root.data < k1){
            // current node and left subtree are too small, go right
            printInRange(root.right, k1, k2);
        } else if(root.data > k2){
            // current node and right subtree are too large, go left
            printInRange(root.left, k1, k2);
        } else {
            // within range
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int v : values){
            root = insert(root, v);
        }

        inorder(root);
        System.out.println();

        if(search(root, 1)){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        // delete 1
        root = delete(root, 1);
        inorder(root);
        System.out.println();

        // print values in range [5, 12]
        printInRange(root, 5, 12);
        System.out.println();
    }
}
