class Polynomial {//
    Node head = null;//node head declared with null value

    
    Polynomial() {
    }

    // Rest of the code remains the same
    void addTerm(int coefficient, int exponent) {//function
        Node newNode = new Node(coefficient, exponent);
        if (head == null || head.exponent < exponent) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.exponent > exponent) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            if (current != head && current.coefficient > 0) {
                System.out.print("+");
            }
            System.out.print(current.coefficient + "x^" + current.exponent + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Polynomial add(Polynomial poly1, Polynomial poly2) {
        Polynomial result = new Polynomial();
        Node n1 = poly1.head;
        Node n2 = poly2.head;

        while (n1 != null && n2 != null) {
            if (n1.exponent == n2.exponent) {
                result.addTerm(n1.coefficient + n2.coefficient, n1.exponent);
                n1 = n1.next;
                n2 = n2.next;
            } else if (n1.exponent > n2.exponent) {
                result.addTerm(n1.coefficient, n1.exponent);
                n1 = n1.next;
            } else {
                result.addTerm(n2.coefficient, n2.exponent);
                n2 = n2.next;
            }
        }

        while (n1 != null) {
            result.addTerm(n1.coefficient, n1.exponent);
            n1 = n1.next;
        }

        while (n2 != null) {
            result.addTerm(n2.coefficient, n2.exponent);
            n2 = n2.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial();
        poly1.addTerm(5, 2);
        poly1.addTerm(3, 4);
        poly1.addTerm(-2, 1);

        Polynomial poly2 = new Polynomial();
        poly2.addTerm(4, 3);
        poly2.addTerm(3, 4);
        poly2.addTerm(-2, 2);

        Polynomial result = add(poly1, poly2);

        System.out.print("Polynomial 1: ");
        poly1.display();
        System.out.print("Polynomial 2: ");
        poly2.display();
        System.out.print("Resultant Polynomial: ");
        result.display();
    }
}
