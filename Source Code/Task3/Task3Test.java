package Task3;

public class Task3Test {
    public static void main(String[] args) {
        // SinglyLinkedList test
        SinglyLinkedList sll = new SinglyLinkedList(); // Create a new singly linked list
        sll.insert_front(10); // Insert 10 at the front
        sll.insert_end(20);   // Insert 20 at the end
        sll.insert_front(5);  // Insert 5 at the front
        sll.display();        // Display the list
        sll.delete(10);       // Delete node with value 10
        sll.display();        // Display the list again

        // DoublyLinkedList test
        DoublyLinkedList dll = new DoublyLinkedList(); // Create a new doubly linked list
        dll.insert_front(30); // Insert 30 at the front
        dll.insert_end(40);   // Insert 40 at the end
        dll.insert_front(25); // Insert 25 at the front
        dll.display();        // Display the list
        dll.delete(40);       // Delete node with value 40
        dll.display();        // Display the list again

        // BinarySearchTree test
        BinarySearchTree bst = new BinarySearchTree(); // Create a new binary search tree
        bst.insert(50); // Insert 50 as root
        bst.insert(30); // Insert 30
        bst.insert(70); // Insert 70
        bst.insert(20); // Insert 20
        bst.insert(40); // Insert 40
        bst.insert(60); // Insert 60
        bst.insert(80); // Insert 80
        System.out.print("In-order traversal: ");
        bst.in_order_traversal(); // Print in-order traversal
        System.out.println("Search 40: " + bst.search(40));   // Search for 40
        System.out.println("Search 100: " + bst.search(100)); // Search for 100
        bst.delete(30); // Delete node with value 30
        System.out.print("In-order traversal after deleting 30: ");
        bst.in_order_traversal(); // Print in-order traversal again

        // AdjacencyMatrixGraph test for provided 0-1-2-3 graph
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(4); // Create a graph with 4 vertices
        graph.addEdge(0, 1); // Add edge between 0 and 1
        graph.addEdge(1, 2); // Add edge between 1 and 2
        graph.addEdge(0, 3); // Add edge between 0 and 3
        graph.printMatrix(); // Print adjacency matrix
    }
}
