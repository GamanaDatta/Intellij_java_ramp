package DataStructures;
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Declaring and initializing an array

        // Access elements
        System.out.println("First Element: " + numbers[0]);

        // Loop through the array
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
