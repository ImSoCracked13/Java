import java.util.*;
import java.io.*;
import java.util.LinkedList;

public class Node {
    int data; 
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node one = new Node(data:5);
        Node two = new Node(data:9);
        Node three = new Node(data:10);
        Node four = new Node(data:7);
        Node five = new Node(data:4);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(four.data);
        System.out.println(get(3).data);

        Node current = one;
        while(current += null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
