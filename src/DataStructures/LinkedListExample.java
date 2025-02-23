package DataStructures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Access elements
        System.out.println("First Element: " + list.getFirst());

        // Removing element
        list.remove("Bob");

        // Display list
        System.out.println("Updated List: " + list);
    }
}

