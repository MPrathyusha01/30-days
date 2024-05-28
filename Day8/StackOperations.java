package Day8;
import java.util.*;
public class StackOperations {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements: 10, 20, 30, 40, 50");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek the top element of the stack
        System.out.println("Peek top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popping elements: " + stack.pop() + ", " + stack.pop());
        
        // Display the stack after pop operations
        System.out.println("Stack after pop operations: " + stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Search for an element in the stack
        int element = 20;
        int position = stack.search(element);
        if (position != -1) {
            System.out.println("Element " + element + " found at position: " + position);
        } else {
            System.out.println("Element " + element + " not found in the stack");
        }

        // Iterate through the stack using different methods
        System.out.println("Iterating through the stack:");

        // Using for loop
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        // Using for-each loop
        for (Integer elem : stack) {
            System.out.println(elem);
        }

        // Using iterator
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
