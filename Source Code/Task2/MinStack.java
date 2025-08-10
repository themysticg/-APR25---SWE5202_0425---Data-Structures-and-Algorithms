package Task2;
import java.util.*;

public class MinStack {
    // Main stack to store all elements
    private Stack<Integer> stack;
    // Auxiliary stack to keep track of minimum elements
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();    // Initialize main stack
        minStack = new Stack<>(); // Initialize min stack
    }

    public void push(int item) {
        stack.push(item); // Push item to main stack
        // If minStack is empty or new item is <= current min, push to minStack
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
    }

    public int pop() {
        int removed = stack.pop(); // Pop from main stack
        // If popped item is the current min, pop from minStack as well
        if (removed == minStack.peek()) {
            minStack.pop();
        }
        return removed; // Return popped item
    }

    public int peek() {
        return stack.peek(); // Return top element of main stack
    }

    public boolean is_empty() {
        return stack.isEmpty(); // Check if main stack is empty
    }

    public int get_min() {
        return minStack.peek(); // Return current minimum element
    }
}
