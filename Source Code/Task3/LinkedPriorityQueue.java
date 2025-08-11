package Task3;

/**
 * Priority Queue using a sorted singly linked list (ascending).
 * enqueue O(n), peek O(1), dequeue O(1); space O(n).
 * Smallest value is always at head.
 */
public class LinkedPriorityQueue {
    private static class Node {
        int val;
        Node next;
        Node(int v) { this.val = v; }
    }

    private Node head; // smallest at head
    private int size;

    /** O(n) – insert in non-decreasing order (duplicates allowed) */
    public void enqueue(int v) {
        Node n = new Node(v);
        if (head == null || v <= head.val) {
            n.next = head;
            head = n;
        } else {
            Node cur = head;
            while (cur.next != null && cur.next.val < v) {
                cur = cur.next;
            }
            n.next = cur.next;
            cur.next = n;
        }
        size++;
    }

    /** O(1) – read smallest; throws if empty */
    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Priority queue is empty");
        return head.val;
    }

    /** O(1) – remove smallest; throws if empty */
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException("Priority queue is empty");
        int v = head.val;
        head = head.next;
        size--;
        return v;
    }

    public boolean isEmpty() { return size == 0; }
    public int size()        { return size; }
}
