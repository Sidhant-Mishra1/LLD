package OOPS.Inheritence;

class P{
    void eat(){
        System.out.println("eat");
    }
}

interface  Q{
    void walk();
}

interface R{
    void walk();
}

public class Hybrid extends P implements Q, R{
    @Override
    public void walk() {
        System.out.println("walk");
    }

//    @Override
//    public void eat() {
//        System.out.println("do nothing");
//    }

    public static void main(String[] args) {
        Hybrid h=new Hybrid();
        h.eat();
        h.walk();
    }
}
