package collectionframework.mapinterface.linkedhashmapclass;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> studentGrades = new LinkedHashMap<>();

        // Add key-value pairs to the map
        studentGrades.put("John", 90);
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);

        // Access values by key
        int johnGrade = studentGrades.get("John");
        System.out.println("John's grade: " + johnGrade);

        // Check if a key exists
        boolean hasAlice = studentGrades.containsKey("Alice");
        System.out.println("Has Alice: " + hasAlice);

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String name = entry.getKey();
            int grade = entry.getValue();
            System.out.println(name + "'s grade: " + grade);
        }

        // Remove a key-value pair
        studentGrades.remove("Bob");

        // Clear the map
        studentGrades.clear();

        // Check if the map is empty
        boolean isEmpty = studentGrades.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

