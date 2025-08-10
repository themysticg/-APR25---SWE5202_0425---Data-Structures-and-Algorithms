package Task3;

public class DoublyLinkedList {
    // Inner class representing a node in the doubly linked list
    class Node {
        int data;      // Value stored in the node
        Node prev, next; // References to previous and next nodes

        Node(int data) { 
            this.data = data; 
        }
    }

    private Node head; // Reference to the head (first node) of the list

    // Insert a new node at the front of the list
    public void insert_front(int value) {
        Node newNode = new Node(value); // Create new node
        newNode.next = head;            // New node points to current head
        if (head != null) 
            head.prev = newNode;        // Update previous head's prev to new node
        head = newNode;                 // Update head to new node
    }

    // Insert a new node at the end of the list
    public void insert_end(int value) {
        Node newNode = new Node(value); // Create new node
        if (head == null) {             // If list is empty
            head = newNode;             // New node becomes head
            return;
        }
        Node temp = head;
        while (temp.next != null) {     // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newNode;            // Last node's next points to new node
        newNode.prev = temp;            // New node's prev points to last node
    }

    // Delete the first node with the given value
    public void delete(int value) {
        Node temp = head;
        // Find the node with the given value
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) return;       // Value not found, do nothing
        if (temp.prev != null) 
            temp.prev.next = temp.next; // Bypass temp in the list
        else 
            head = temp.next;           // If deleting head, update head
        if (temp.next != null) 
            temp.next.prev = temp.prev; // Update next node's prev
    }

    // Display the list from head to end
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Print current node's data
            temp = temp.next;                  // Move to next node
        }
        System.out.println();
    }
}
