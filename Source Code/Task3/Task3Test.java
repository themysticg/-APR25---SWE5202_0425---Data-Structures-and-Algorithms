package Task3;

public class Task3Test {
    public static void main(String[] args) {

        // === SinglyLinkedList test ===
        System.out.println("=== SinglyLinkedList ===");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert_front(10);
        sll.insert_end(20);
        sll.insert_front(5);
        sll.display();           // expect: 5 10 20
        sll.delete(10);
        sll.display();           // expect: 5 20
        System.out.println();

        // === DoublyLinkedList test ===
        System.out.println("=== DoublyLinkedList ===");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert_front(30);
        dll.insert_end(40);
        dll.insert_front(25);
        dll.display();           // expect: 25 30 40
        dll.delete(40);
        dll.display();           // expect: 25 30
        System.out.println();

        // === BinarySearchTree test ===
        System.out.println("=== BinarySearchTree ===");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-order traversal: ");
        bst.in_order_traversal();           // your method prints directly
        System.out.println();

        System.out.println("Search 40: " + bst.search(40));   // expect true
        System.out.println("Search 100: " + bst.search(100)); // expect false

        bst.delete(30); // node with two children
        System.out.print("In-order after deleting 30: ");
        bst.in_order_traversal();           // prints again
        System.out.println();

        // === AdjacencyMatrixGraph test (0-1, 1-2, 0-3) ===
        System.out.println("=== AdjacencyMatrixGraph ===");
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.printMatrix(); // expect symmetric 4x4
        System.out.println();

        // === LinkedQueue demo (LO3) ===
        System.out.println("=== LinkedQueue demo ===");
        LinkedQueue q = new LinkedQueue();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println("dequeue -> " + q.dequeue()); // expect 1
        System.out.println("peek    -> " + q.peek());    // expect 2
        System.out.println();

        // === LinkedPriorityQueue demo (LO3) ===
        System.out.println("=== LinkedPriorityQueue demo ===");
        LinkedPriorityQueue pq = new LinkedPriorityQueue();
        pq.enqueue(20); pq.enqueue(5); pq.enqueue(15);
        System.out.println("peek    -> " + pq.peek());    // expect 5
        System.out.println("dequeue -> " + pq.dequeue()); // expect 5
        System.out.println("peek    -> " + pq.peek());    // expect 15
    }
}
