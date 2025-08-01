import java.util.*;

class DoubleQueue {
    int arr[];
    int front;
    int rear;
    int capacity;

    public DoubleQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        capacity = size;
    }

    void insertfront(int data) {
        if (front == 0) {
            System.out.println("You can't enter elements from front");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else {
                front = front - 1;
            }
            arr[front] = data; // Insert the element at the new front index.
        }
    }

    void insertrear(int data) {
        if (rear == capacity - 1) {//using if-else statement
            System.out.println("Queue is full. Can't insert from rear.");
        } else {
            if (rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = rear + 1;
            }
            arr[rear] = data; // Insert the element at the new rear index.
        }
    }

    void deletefront() {
        if (front == -1) {//using if-else statement
            System.out.println("Queue is empty. Can't delete from front.");
        } else {
            System.out.println("Deleted from front: " + arr[front]);
            if (front == rear) { // If the queue becomes empty after deletion
                front = -1;
                rear = -1;
            } else {
                front = front + 1;
            }
        }
    }

    void deleterear() {
        if (rear == -1) {//using if-else Statement
            System.out.println("Queue is empty. Can't delete from rear.");
        } else {
            System.out.println("Deleted from rear: " + arr[rear]);
            if (rear == front) { // If the queue becomes empty after deletion
                front = -1;
                rear = -1;
            } else {
                rear = rear - 1;
            }
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the double-ended queue:");
        int size = sc.nextInt();
        DoubleQueue dq = new DoubleQueue(size);

        while (true) {
            System.out.println("\n1. Insert at front");
            System.out.println("2. Insert at rear");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at front: ");
                    int frontElement = sc.nextInt();
                    dq.insertfront(frontElement);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at rear: ");
                    int rearElement = sc.nextInt();
                    dq.insertrear(rearElement);
                    break;
                case 3:
                    dq.deletefront();
                    break;
                case 4:
                    dq.deleterear();
                    break;
                case 5:
                    dq.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
