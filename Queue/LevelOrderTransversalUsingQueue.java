// Define the Node class
class Node {
    int val;//variable declared
    Node left, right;
    Node(int x) { val = x; }
}

// Define a custom Queue class
class Queue {
    private Node[] elements;
    private int front, rear, size, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new Node[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Node node) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = node;
        size++;
    }

    public Node dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        Node node = elements[front];
        front = (front + 1) % capacity;
        size--;
        return node;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

// Define the main class
public class LevelOrderTraversal {
    public void levelOrder(Node root) {
        if (root == null) return;

        Queue queue = new Queue(100); // Adjust capacity as needed
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.dequeue();
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null) queue.enqueue(currentNode.left);
            if (currentNode.right != null) queue.enqueue(currentNode.right);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        LevelOrderTraversal traversal = new LevelOrderTraversal();
        traversal.levelOrder(root);
    }
}
