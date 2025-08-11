package Task3;

/**
 * Queue backed by a singly linked list (FIFO).
 * Operations: enqueue O(1), dequeue O(1), peek O(1); space O(n).
 */
public class LinkedQueue {
    private static class Node {
        int val;
        Node next;
        Node(int v) { this.val = v; }
    }

    private Node head; // front (dequeue here)
    private Node tail; // back  (enqueue here)
    private int size;

    /** O(1) – add to tail */
    public void enqueue(int v) {
        Node n = new Node(v);
        if (tail == null) {     // empty queue
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    /** O(1) – remove from head; throws if empty */
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        int v = head.val;
        head = head.next;
        if (head == null) tail = null; // queue became empty, keep pointers consistent
        size--;
        return v;
    }

    /** O(1) – read front; throws if empty */
    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return head.val;
    }

    public boolean isEmpty() { return size == 0; }
    public int size()        { return size; }
}
