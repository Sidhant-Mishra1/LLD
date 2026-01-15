package OOPS.Inheritence;

//Multilevel inheritance is when a class is derived from a child class, forming a chain of inheritance.

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
