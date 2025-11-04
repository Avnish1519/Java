class DLL{               //class Doubly Linked List Defined
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    Node head=null;

    void insertBeg(int data){//function to insert at beggining 
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev=newNode;
            head=newNode;

        }
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {//using if control statement
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    void insertPos(int data,int pos){
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current.next == null) {
                System.out.println("Position out of range");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

    }

    void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(head.next==null){
             System.out.println(head.data+" deleted");
             head=null;
        }
        else{
            System.out.println(head.data+" deleted");
            head=head.next;
            head.prev=null;
        }
    }

    void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(head.next==null){
             System.out.println(head.data+" deleted");
             head=null;
        }
        Node current = head;
        while(current.next.next!= null){
            current =  current.next;
        }
        System.out.println(current.next.data+" deleted");
        current.next=null;
    }

    void deletePos(int pos){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else if(head.next==null){
             System.out.println(head.data+" deleted");
             head=null;
        }
        Node current =head;
        for(int i=0;i<pos-1;i++){
            current  = current.next;

        }
        System.out.println(current.next.data+" deleted");
        current.next= current.next.next;
        current.next.next.prev=current;
    }

    void printList(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
  
        }
        System.out.print("null");
    }
}
public class DoublyLinkedList{
    public static void main(String [] args){
        DLL List = new DLL();
        List.insertBeg(10);//inserting values
        List.insertBeg(20);
        List.insertBeg(30);
        List.insertLast(40);
        List.insertLast(50);
        List.insertLast(60);
        List.insertPos(70,2);
        List.deleteFirst();
        List.deleteLast();
        List.deletePos(2);

        List.printList();
    }
}
