package OOPS.Polymorphism;

class Dog {
    public void sound() {
        System.out.println("barks");
    }
}
class Cat extends Dog{
    @Override
    public void sound() {
        System.out.println("Meowww");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Dog d;
        d=new Dog();
        d.sound();
        d=new Cat();
        d.sound();
    }
}

