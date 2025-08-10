package Task3;

public class BinarySearchTree {
    // Inner class representing a node in the BST
    class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int data) { this.data = data; }
    }

    private TreeNode root; // Root node of the BST

    // Public method to insert a value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Helper method for recursive insertion
    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) return new TreeNode(value); // Insert new node if current is null
        if (value < node.data) node.left = insertRec(node.left, value); // Go left
        else if (value > node.data) node.right = insertRec(node.right, value); // Go right
        return node; // Return the (possibly updated) node
    }

    // Public method to search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Helper method for recursive search
    private boolean searchRec(TreeNode node, int value) {
        if (node == null) return false; // Value not found
        if (node.data == value) return true; // Value found
        // Search left or right subtree based on comparison
        return value < node.data ? searchRec(node.left, value) : searchRec(node.right, value);
    }

    // Public method to delete a value from the BST
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    // Helper method for recursive deletion
    private TreeNode deleteRec(TreeNode node, int value) {
        if (node == null) return null; // Value not found
        if (value < node.data) node.left = deleteRec(node.left, value); // Go left
        else if (value > node.data) node.right = deleteRec(node.right, value); // Go right
        else {
            // Node with only one child or no child
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            // Node with two children: get the inorder successor (smallest in the right subtree)
            node.data = minValue(node.right);
            // Delete the inorder successor
            node.right = deleteRec(node.right, node.data);
        }
        return node; // Return the (possibly updated) node
    }

    // Helper method to find the minimum value in a subtree
    private int minValue(TreeNode node) {
        int minVal = node.data;
        while (node.left != null) {
            node = node.left;
            minVal = node.data;
        }
        return minVal;
    }

    // Public method to perform in-order traversal of the BST
    public void in_order_traversal() {
        inOrderRec(root);
        System.out.println();
    }

    // Helper method for recursive in-order traversal
    private void inOrderRec(TreeNode node) {
        if (node != null) {
            inOrderRec(node.left); // Visit left subtree
            System.out.print(node.data + " "); // Print node data
            inOrderRec(node.right); // Visit right subtree
        }
    }
}