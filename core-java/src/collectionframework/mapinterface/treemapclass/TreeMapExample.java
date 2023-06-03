package collectionframework.mapinterface.treemapclass;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<String, Integer> studentGrades = new TreeMap<>();

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

    /*
     In Java, the TreeMap class is an implementation of the Map interface that stores 
     key-value pairs in a sorted order based on the natural ordering of the keys or a custom comparator.
     It uses a Red-Black tree data structure to maintain the elements and provides efficient
     operations for searching, insertion, and deletion.
       */
}
