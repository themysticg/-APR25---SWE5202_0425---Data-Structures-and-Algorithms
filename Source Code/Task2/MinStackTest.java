package Task2;

// MinStackTest.java
public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Demonstrating push operations
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        // Retrieving current minimum
        System.out.println("Current minimum: " + minStack.get_min()); // Expected: 2

        // Peek top element
        System.out.println("Top element: " + minStack.peek()); // Expected: 2

        // Pop top element
        System.out.println("Popped element: " + minStack.pop()); // Expected: 2

        // Check current minimum after pop
        System.out.println("Current minimum after pop: " + minStack.get_min()); // Expected: 3

        // Check if stack is empty
        System.out.println("Is stack empty? " + minStack.is_empty()); // Expected: false

        // Pop remaining elements to test is_empty
        minStack.pop();
        minStack.pop();
        minStack.pop();

        System.out.println("Is stack empty after removing all elements? " + minStack.is_empty()); // Expected: true
    }
}