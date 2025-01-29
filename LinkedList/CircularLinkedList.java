class CLL{
    class Node{
        int data;
        Node next;

        Node(int data){
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
}
class CircularLinkedList{
    public static void main(String [] args){
        CLL List = new CLL();

        List.insertBeg(10);
        List.insertBeg(20);
        List.insertBeg(30);
        List.insertLast(5);

        List.insertPos(15,2);
        List.printList();

    }
}