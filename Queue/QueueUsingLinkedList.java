import java.util.*;
class Queue{
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    Node front = null;
    Node rear = null;

    void insert(int data){
        Node newNode = new Node(data);
        if(rear == null){

            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    void delete(){
        if(front == null){
            System.out.println("List is Empty");

        }
        else if(front==rear){
            System.out.println(front.data+" deleted");
            front = null;
            rear = null;
        }else {
            System.out.println(front.data+ " deleted");
            front = front.next;
        }
    }

    void printList(){
        Node current = front;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
class QueueUsingLinkedList{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        Queue q1 = new Queue();
        while(true){
            System.out.println("1-Insert,2-delete,3-Display,4-Exit");
            int c = sc.nextInt();
            if (c==1){
                System.out.println("Enter Value");
                int data = sc.nextInt();
                q1.insert(data);
            }

            else if (c==2){
                
                q1.delete();
            }
            else if (c==3){
                
                q1.printList();
            }
            else if(c==4){
                break;
            }
            else{
                System.out.println("Enter correct choice");
            }

        }

    }
}