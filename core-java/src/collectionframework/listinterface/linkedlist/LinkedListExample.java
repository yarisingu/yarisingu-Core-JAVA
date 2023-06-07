package collectionframework.listinterface.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Linked List: " + linkedList);

        // Adding an element at the beginning of the linked list
        linkedList.addFirst("Mango");

        // Adding an element at the end of the linked list
        linkedList.addLast("Grapes");

        System.out.println("Updated Linked List: " + linkedList);

        // Getting the first and last elements of the linked list
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing elements from the linked list
        linkedList.remove("Banana");
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Updated Linked List: " + linkedList);

        // Iterating over the linked list using a for-each loop
        System.out.println("Elements of the Linked List:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

