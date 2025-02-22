package Methods;

public class Arguments {


    public static void main(String[] args) {

// Call the method with different arguments
        greet("Alice");
        greet("Bob");

        int result = add(10, 20);
        System.out.println("The sum is: " + result);
    }

    // Method with one argument
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with two arguments
    public static int add(int num1, int num2) {
        return num1 + num2; // Return the sum of the two arguments
    }



}
