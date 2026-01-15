package OOPS.Inheritence;

//When a class inherits from only one parent class, it is called single inheritance.

class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void greetChild() {
        System.out.println("Hello from Child");
    }
}

public class Single {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();       // inherited from Parent
        c.greetChild();  // own method
    }
}
