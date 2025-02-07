// Class representing a node in the BST
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Class representing the BST
class BST {
    Node root;

    BST() {
        root = null;
    }

    // Method to insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Helper method for insertion
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    // Method to delete a key
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    // Helper method for deletion
    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    // Helper method to find the minimum value
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Method to search for a key
    boolean search(int key) {
        return searchRec(root, key) != null;
    }

    // Helper method for searching
    Node searchRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    // Method for in-order traversal
    void inorder() {
        inorderRec(root);
    }

    // Helper method for in-order traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}

// Main class to test the BST
public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("\n\nDelete 20");
        tree.deleteKey(20);
        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("\n\nDelete 30");
        tree.deleteKey(30);
        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("\n\nDelete 50");
        tree.deleteKey(50);
        System.out.println("In-order traversal:");
        tree.inorder();

        System.out.println("\n\nSearch for 40: " + (tree.search(40) ? "Found" : "Not Found"));
    }
}
