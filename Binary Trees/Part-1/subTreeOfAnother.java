import java.util.*;

public class subTreeOfAnother {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; left = right = null; }
    }

    // Check if two trees are identical (structure + values)
    public static boolean isIdentical(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.data != b.data) return false;
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }

    // Check if subRoot is a subtree of root
    public static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) return true; // empty tree is subtree
        if (root == null) return false;   // non-empty subRoot can't be found
        // If trees match at this node, return that result
        if (isIdentical(root, subRoot)) return true;
        // Otherwise search left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        /*
         * Big tree (root):
         *           1
         *         /   \
         *        2     3
         *       / \   / \
         *      4  5  6  7
         *
         * subRoot:
         *      2
         *     / \
         *    4   5
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("subRoot is a subtree of root? " + isSubtree(root, subRoot));

        Node notSub = new Node(2);
        notSub.left = new Node(4);
        notSub.right = new Node(8); // 8 not present in root
        System.out.println("notSub is a subtree of root? " + isSubtree(root, notSub));
    }
}
