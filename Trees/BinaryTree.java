class Node {
    int data;
    Node left, right;

    public Node(int item) {// node function 
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);//printing the output
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        //calling things
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal");
        tree.printInOrder(tree.root);

        System.out.println("\nPreorder traversal");
        tree.printPreOrder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.printPostOrder(tree.root);
    }
}
