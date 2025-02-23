package DataStructures;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping element
        System.out.println("Popped: " + stack.pop());

        // Peek at top element
        System.out.println("Top Element: " + stack.peek());

        // Check if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}

