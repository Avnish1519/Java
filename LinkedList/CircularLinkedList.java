class CLL{
    class Node{//class Node declared
        int data;
        Node next;

        Node(int data){//constructor
            this.data = data;
            this.next = null;
        }
    }
    Node tail=null;

    void insertBeg(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail=newNode;
            tail.next=tail;
        }
        else{
            newNode.next= tail.next;
            tail.next = newNode;
        }
    }

    void insertLast(int data){
        Node newNode = new Node(data);
        if(tail==null){
            tail =newNode;
            tail.next = tail;
        }
        else{
            
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;


        }
    }

    void insertPos(int data,int pos){
        Node newNode =  new Node(data);
        if (tail == null) {
        if (pos == 0) {
            tail = newNode;
            tail.next = tail;
        } else {
            System.out.println("Invalid position");
        }
        return;
    } else if (pos == 0) {
        newNode.next = tail.next;
        tail.next = newNode;
        return;
    }
        
        else{
            Node current  = tail.next;
            for(int i=0;i<pos-1;i++){
                current =  current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            if(current ==tail){
                tail = newNode;
            }
        }
    }

    void deletefirst(){
        if(tail==null){
            System.out.println("Empty List");
        }
        else if(tail==tail.next){
            System.out.println(tail.data+" deleted");
            tail=null;

        }
        else{
            System.out.println(tail.next.data+" deleted");
            tail.next=tail.next.next;
            
        }
    }

    void deleteLast(){
        if(tail==null){
            System.out.println("Underflow");
        }
        else if(tail==tail.next){
            System.out.println(tail.data+ " deleted");
            tail=null;
        }else{
            Node current = tail.next;
            while(current.next!=tail){
                current = current.next;
                
            }
            System.out.println(tail.data+" deleted");
            current.next=tail.next;
            tail=current;
        }
    }

    void deletePos(int pos) {
    if (tail == null) {
        System.out.println("Underflow");
    } else if (tail == tail.next) {
        System.out.println(tail.data + " deleted");
        tail = null;
    } else {
        Node current = tail.next;
        for (int i = 1; i < pos - 1 && current != tail; i++) {
            current = current.next;
        }
        if (current == tail || current.next == tail.next) {
            System.out.println("Position out of bounds");
        } else {
            System.out.println(current.next.data + " deleted");
            current.next = current.next.next;
        }
    }
}




    void printList(){
        if(tail==null){
            System.out.println("List is Empty");
            return;
        }
        else{
            Node current=tail.next;
            while(current!=tail){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.println(tail.data + " -> (back to head)");
            
        }
    }

    
}
class CircularLinkedList{
    public static void main(String [] args){
        CLL List = new CLL();

        List.insertBeg(10);
        List.insertBeg(20);
        List.insertBeg(30);
        List.insertLast(5);
        List.insertLast(35);
        List.insertLast(45);
        List.deletefirst();
        List.deleteLast();
        List.deletePos(3);

        List.insertPos(15,2);
        List.printList();

    }
}