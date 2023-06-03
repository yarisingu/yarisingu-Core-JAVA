package collectionframework.mapinterface.hashtableclass;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Map<String, Integer> studentGrades = new Hashtable<>();

        // Add key-value pairs to the hashtable
        studentGrades.put("John", 90);
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);

        // Access values by key
        int johnGrade = studentGrades.get("John");
        System.out.println("John's grade: " + johnGrade);

        // Check if a key exists
        boolean hasAlice = studentGrades.containsKey("Alice");
        System.out.println("Has Alice: " + hasAlice);

        // Iterate over the hashtable
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String name = entry.getKey();
            int grade = entry.getValue();
            System.out.println(name + "'s grade: " + grade);
        }

        // Remove a key-value pair
        studentGrades.remove("Bob");

        // Clear the hashtable
        studentGrades.clear();

        // Check if the hashtable is empty
        boolean isEmpty = studentGrades.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

