package Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Prints only the integers < 50 from an ArrayList using an Iterator.
 *
 * Time complexity:
 *  - Building the list below is O(n)
 *  - Single pass with Iterator is O(n)
 * Space complexity: O(n) for the list.
 */
public class ArrayListIteratorExample {
    public static void main(String[] args) {
        // Example data set. Replace with your own values if desired.
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i += 7) {  // 0, 7, 14, ..., 98
            nums.add(i);
        }

        // REQUIRED: Use an Iterator to traverse and print only values < 50
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {                // O(n) traversal
            int v = it.next();                // O(1)
            if (v < 50) {                     // filter condition
                System.out.println(v);        // prints: 0 7 14 21 28 35 42 49
            }
        }
    }
}
