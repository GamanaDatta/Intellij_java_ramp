package DataStructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key
        map.remove(1);

        // Displaying HashMap
        System.out.println("Updated Map: " + map);
    }
}

