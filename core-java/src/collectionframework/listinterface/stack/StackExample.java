package collectionframework.listinterface.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println("Stack: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Accessing the top element of the stack without removing it
        String topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Updated Stack: " + stack);

        // Searching for an element in the stack
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' in the stack: " + position);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // Iterating over the stack using a while loop
        System.out.println("Elements of the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

