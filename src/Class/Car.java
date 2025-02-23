package Class;

public class Car
{
    // Fields (State)
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method (Behavior)
    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

// Main class
/*public class Main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car("Toyota", 120);

        // Calling method on object
        myCar.display();
    }
    }
    */

