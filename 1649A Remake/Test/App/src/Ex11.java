class Queue {
    // Implement a queue using an array with the operations enqueue() and dequeue() without using Java’s built-in Queue class.
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public Queue(int size) {
        queueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    // Check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        count++;
    }

    // Dequeue operation to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1; // Return a sentinel value or throw an exception
        }
        int value = queueArray[front];
        front = (front + 1) % capacity;
        count--;    
        return value;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}