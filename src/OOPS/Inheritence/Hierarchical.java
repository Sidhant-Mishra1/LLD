package OOPS.Inheritence;

//Hierarchical inheritance is when multiple child classes inherit from the same parent class.

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike rides");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}
