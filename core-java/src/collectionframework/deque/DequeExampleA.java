package collectionframework.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExampleA {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front of the deque
        deque.addFirst("Element 1");
        deque.addFirst("Element 2");
        deque.addFirst("Element 3");

        // Adding elements to the end of the deque
        deque.addLast("Element 4");
        deque.addLast("Element 5");

        System.out.println("Deque: " + deque);

        // Removing elements from the front of the deque
        String firstElement = deque.removeFirst();
        System.out.println("Removed first element: " + firstElement);

        // Removing elements from the end of the deque
        String lastElement = deque.removeLast();
        System.out.println("Removed last element: " + lastElement);

        System.out.println("Updated Deque: " + deque);

        // Accessing elements from the front and end of the deque
        String frontElement = deque.peekFirst();
        String endElement = deque.peekLast();

        System.out.println("Front element: " + frontElement);
        System.out.println("End element: " + endElement);
    }
}

