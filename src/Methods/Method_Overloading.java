package Methods;

public class Method_Overloading {

    //method overloading is multiple methods  having the same name(below ex: add) with different parameters:
    //Instead of defining two methods that should do the same thing, it is better to overload one.

    public static void main(String[] args) {
        // Calling various overloaded methods
        System.out.println(add(5, 10));             // Calls the first add method (int, int)
        System.out.println(add(5.5, 10.5));         // Calls the second add method (double, double)
        System.out.println(add("Hello", "World"));  // Calls the third add method (String, String)
    }

    // Overloaded method 1: Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: Adds two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Overloaded method 3: Concatenates two strings
    public static String add(String a, String b) {
        return a + b; // Concatenate strings
    }

}
