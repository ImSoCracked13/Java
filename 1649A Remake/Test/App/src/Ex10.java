class Stack {
    // Implement a stack using an array with the operations push() and pop() without using Java’s built-in Stack class.
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Push operation to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop operation to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Return a sentinel value or throw an exception
        }
        return stackArray[top--];
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
