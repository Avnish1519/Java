class LL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void insertbeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println(head.data + " deleted");
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            Node current = head;
            while (current.next != null && current.next.next != null) {
                current = current.next;
            }
            System.out.println(current.next.data + " deleted");
            current.next = null;
        }
    }

    void deletePos(int pos) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (pos == 0) {
            deleteFirst();
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current.next == null) {
                System.out.println("Position out of range");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of range");
            return;
        }
        System.out.println(current.next.data + " deleted");
        current.next = current.next.next;
    }

    // Function to reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertbeg(10);
        linkedList.insertLast(20);
        linkedList.insertLast(35);
        linkedList.insertLast(40);
        linkedList.insertLast(50);
        linkedList.insertbeg(30);
        linkedList.deleteLast();
        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.deletePos(1);

        System.out.println("Original Linked List:");
        linkedList.printList();

        linkedList.reverse();

        System.out.println("Reversed Linked List:");
        linkedList.printList();
    }
}
