class SimpleQueue {
    int[] queue;
    int front, rear, capacity;

    public SimpleQueue(int size) {//initialization of simple Queue 
        queue = new int[size];
        front = rear = 0;
        capacity = size;
    }

    // Add an item to the queue
    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full!");//print fn
            return;
        }
        queue[rear++] = item;
        System.out.println("Enqueued " + item);
    }

    // Print the contents of the queue
    public void printQueue() {
        if (front == rear) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Function to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(item + " dequeued from queue");
        return item;
    }
}

class QueueUsingArrays {
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();

        q.printQueue();
    }
}
