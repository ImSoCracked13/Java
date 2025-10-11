class Node {
    // Define a singly or doubly linked list and write programs to insert a new node at (a) the beginning, and (b) the end of the list without using Java’s built-in LinkedList class.
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Set the next node to the current head
        head = newNode; // Set the head to the new node
    }

    // Insert a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Set the head to the new node
        } else {
            Node current = head; // Set the current node to the head
            while (current.next != null) { // While the current node has a next node
                current = current.next; // Set the current node to the next node
            }
            current.next = newNode; // Set the next node of the current node to the new node
        }
    }
}

public class Ex09 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(40);
        list.insertAtEnd(30);
        System.out.println("The list is: " + list.head.data + " -> " + list.head.next.data + " -> " + list.head.next.next.data + " -> " + list.head.next.next.next.data);
    }
}