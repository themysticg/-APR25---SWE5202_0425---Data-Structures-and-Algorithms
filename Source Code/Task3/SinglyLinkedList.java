package Task3;

public class SinglyLinkedList {
    // Inner class representing a node in the linked list
    class Node {
        int data;      // Data stored in the node
        Node next;     // Reference to the next node

        Node(int data) { 
            this.data = data; 
            this.next = null; 
        }
    }

    private Node head; // Reference to the head (first node) of the list

    // Insert a new node at the front of the list
    public void insert_front(int value) {
        Node newNode = new Node(value); // Create new node
        newNode.next = head;            // Point new node to current head
        head = newNode;                 // Update head to new node
    }

    // Insert a new node at the end of the list
    public void insert_end(int value) {
        Node newNode = new Node(value); // Create new node
        if (head == null) {             // If list is empty
            head = newNode;             // Set head to new node
            return;
        }
        Node temp = head;
        while (temp.next != null) {     // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newNode;            // Link last node to new node
    }

    // Delete the first node with the specified value
    public void delete(int value) {
        if (head == null) return;       // If list is empty, do nothing
        if (head.data == value) {       // If head needs to be deleted
            head = head.next;           // Move head to next node
            return;
        }
        Node temp = head;
        // Traverse to the node before the one to delete
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {        // If node to delete is found
            temp.next = temp.next.next; // Bypass the node to delete
        }
    }

    // Display all elements in the list
    public void display() {
        Node temp = head;
        while (temp != null) {          // Traverse the list
            System.out.print(temp.data + " "); // Print node data
            temp = temp.next;           // Move to next node
        }
        System.out.println();           // Newline after printing list
    }
}