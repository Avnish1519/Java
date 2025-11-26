class SLL{
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node head= null;

    boolean isEmpty(){
        return (head==null);
    }

    void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){//using if-else loop
            head  = newNode;
        }
        else{
            newNode.next = head;
            head=newNode;
        }
    }

    void pop(){
        
        if(isEmpty()){//using if-else control statement
            System.out.println("List is Empty");
        }
        else{
            int top = head.data;
            System.out.println(top+" deleted");
            head=head.next;
            System.out.println(top);
            
        }
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        
        } else {
            System.out.println(head.data+" <- head");
        }
    }

    void printList(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else{
            Node current = head;
            while(current != null){
                
                System.out.print(current.data + " -> ");
                current  = current.next;
            }
            System.out.println("null");

        }
    }
}
class Stack{
    public static void main(String [] args){
        SLL List = new SLL();

        List.push(10);
        List.push(20);
        List.push(30);
        List.pop();
        List.peek();

        List.printList();


    }
}
