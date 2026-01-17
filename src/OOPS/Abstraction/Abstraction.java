package OOPS.Abstraction;

// Abstraction: Hides underlying implementation
// TODO : Can also be implemented using Interfaces
abstract class Notification {
    abstract void send();   // abstract method
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Notification n = new EmailNotification(); // abstraction
        n.send();
    }
}
