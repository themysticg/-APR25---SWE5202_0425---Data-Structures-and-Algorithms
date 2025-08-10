package Task4;

import java.util.HashMap;
import java.util.Map;

public class PrintHashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their scores
        Map<String, Integer> students = new HashMap<>();
        // Add student names and scores to the map
        students.put("ram", 50);
        students.put("ravi", 60);
        students.put("raju", 70);
        students.put("kumar", 80);

        // Print a header message
        System.out.println("Printing all keys and their corresponding values:");
        // Iterate over the keys of the map and print each key-value pair
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
